/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AMARINA
 */
public class GameClient extends Thread{
    GameGUI gui;
    private final String ID = "p1";
    
    // multicast settings
    private MulticastSocket multSocket;
    int  multPort;
    InetAddress group;
    
    // tcp settings
    Socket tcpSocket;
    DataOutputStream out;
    
    private int round;
    private String pos;
    
    public GameClient(){
        multSocket = null;
        tcpSocket = null;
        
        round = 0;
        pos = "m11";
    }
    
    public void setFrame(GameGUI frame){
        this.gui = frame;
    }
    
    public boolean conectar(String ip, int multPort, String tcpIP, int tcpPort){
        try {
            //multicast connection
            this.multPort = multPort;
            this.group = InetAddress.getByName(ip);
            this.multSocket = new MulticastSocket(multPort);
            multSocket.joinGroup(group);
            
            //tcp connection
            this.tcpSocket = new  Socket(tcpIP, tcpPort);
            this.out = new DataOutputStream(tcpSocket.getOutputStream());
            
            return true;
        } catch (UnknownHostException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
    }
    
    public void run(){
        byte[] buffer;
        DatagramPacket mole;
        
        try {
            while(true){
                buffer = new byte[1000];
                mole = new DatagramPacket(buffer, buffer.length);
                System.out.println("Esperando mensajes");
                multSocket.receive(mole);
                escribeGUI(new String(mole.getData(), 0, mole.getLength()));
            }
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void escribeGUI(String mole){
        String[] resp = mole.split(",");
        String newPos;
        
        System.out.println("Recibí: "+mole);
        
        if(resp.length == 1){
            gui.ganador(mole);
        }else{
            newPos = "m"+resp[0]+""+resp[1];
            round = Integer.parseInt(resp[2]);
            
            gui.removeMole(pos);
            gui.setMole(newPos);
            pos = newPos;
        }
    }
    
    public void responde(){
        System.out.println("Respuesta");
        
        try {
            out.writeUTF(ID);
            out.writeInt(round);
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}