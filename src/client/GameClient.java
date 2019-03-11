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
    private GameGUI gui;
    private String ID;
    
    // multicast settings
    private MulticastSocket multSocket;
    private int  multPort;
    private InetAddress group;
    
    // tcp settings
    private Socket tcpSocket;
    private DataOutputStream out;
    private String tcpIP;
    private int tcpPort;
    
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
    
    public boolean conectar(String multIP, int multPort, String tcpIP, int tcpPort, String playerID){
        try {
            this.ID = playerID;
            this.tcpIP = tcpIP;
            this.tcpPort = tcpPort;
            
            //multicast connection
            this.multPort = multPort;
            this.group = InetAddress.getByName(multIP);
            this.multSocket = new MulticastSocket(multPort);
            multSocket.joinGroup(group);
            
            /*
            
            */
            
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
        
        while(true){
            try{
                buffer = new byte[1000];
                mole = new DatagramPacket(buffer, buffer.length);
                System.out.println("Esperando mensajes");
                multSocket.receive(mole);
                escribeGUI(new String(mole.getData(), 0, mole.getLength()));
            }catch(SocketException ex){
              System.out.println("Fin.");
              break;
            }catch (IOException ex) {
                Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void close(){
        try {
            multSocket.leaveGroup(group);
            multSocket.close();
            
            //tcp connection
            this.tcpSocket = new  Socket(tcpIP, tcpPort);
            this.out = new DataOutputStream(tcpSocket.getOutputStream());
            out.writeUTF(ID);
            out.writeInt(-1);
            tcpSocket.close();
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
            //tcp connection
            this.tcpSocket = new  Socket(tcpIP, tcpPort);
            this.out = new DataOutputStream(tcpSocket.getOutputStream());
            
            out.writeUTF(ID);
            out.writeInt(round);
            
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                this.tcpSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}