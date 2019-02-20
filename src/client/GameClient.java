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

/**
 *
 * @author AMARINA
 */
public class GameClient {
    GameGUI gui;
    
    // multicast settings
    private MulticastSocket multSocket;
    int  multPort;
    InetAddress group;
    
    // tcp settings
    Socket tcpSocket;
    int tcpPort;
    String tcpIP;
    DataOutputStream out;
    
    public GameClient(){
        multSocket = null;
        tcpSocket = null;
    }
    
    public void setFrame(GameGUI frame){
        this.gui = frame;
    }
    
    public boolean empezar(String ip, int multPort){
        try {
            //multicast connection
            this.multPort = multPort;
            this.group = InetAddress.getByName(ip);
            this.multSocket = new MulticastSocket(multPort);
            multSocket.joinGroup(group);
            
            // tcp connection
            //tthis.cpSocket = new  Socket(tcpIP, tcpPort);
            //this. out = new DataOutputStream(tcpSocket.getOutputStream());
            
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
    
    public void juega(){
        byte[] buffer;
        DatagramPacket mole;
        
        try {
            while(true){
                buffer = new byte[1000];
                mole = new DatagramPacket(buffer, buffer.length);
                System.out.println("Esperando mensajes");
                multSocket.receive(mole);
                escribe(new String(mole.getData()));//, out);
            }
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void escribe(String pos){//, DataOutputStream out){
        System.out.println("La posicion es: "+pos);
        responde();//out);
    }
    
    public void responde(){//DataOutputStream out){
        System.out.println("Respuesta");
        /*try {
            out.writeUTF("Le pegué");
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
        /*
    public static void main(String[] args){
        GameGUI gui = new GameGUI();
        gui.setVisible(true);
        gui.setGame(new GameClient());
        
        System.out.println("hola");
        
        // multicast settings
        MulticastSocket multSocket = null;
        int multPort = 6789;
        String ip = "228.5.6.7";
        
        // tcp settings
        Socket tcpSocket;
        int tcpPort = 6789;
        String tcpIP = "localhost";
        
        try {
            // multicast connection
            InetAddress group = InetAddress.getByName(ip); 
            multSocket = new MulticastSocket(multPort);
            multSocket.joinGroup(group);
            
            // tcp connection
            //tcpSocket = new  Socket(tcpIP, tcpPort);
            //DataOutputStream out = new DataOutputStream(tcpSocket.getOutputStream());
            
            byte [] buffer;
            DatagramPacket mole; 
            
            while(true){
                buffer = new byte[1000];
                mole = new DatagramPacket(buffer, buffer.length);
                System.out.println("Esperando mensajes");
                multSocket.receive(mole);
                multSocket.leaveGroup(group);
                escribe(new String(mole.getData()));//, out);
            }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    */
}