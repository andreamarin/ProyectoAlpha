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

/**
 *
 * @author AMARINA
 */
public class GameClient {
    
    public static void main(String[] args){
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
    
    public static void escribe(String pos){//, DataOutputStream out){
        System.out.println("La posicion es: "+pos);
        responde();//out);
    }
    
    public static void responde(){//DataOutputStream out){
        System.out.println("Respuesta");
        /*try {
            out.writeUTF("Le pegué");
        } catch (IOException ex) {
            Logger.getLogger(GameClient.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}

/* RECEIVE MULTICAST 
    byte[] buffer = new byte[1000];
    System.out.println("Waiting for messages");

    DatagramPacket messageIn = new DatagramPacket(buffer, buffer.length);
    s.receive(messageIn);
*/