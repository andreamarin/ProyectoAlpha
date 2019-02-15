/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.net.*;
import java.util.logging.*;

/**
 *
 * @author AMARINA
 */
class MulticastConnection extends Thread{
    MulticastSocket s;
    InetAddress group;
    int port;
    int ronda;

    public MulticastConnection(String ip, int port){
        try {
            this.port = port;
            ronda = 1;
            // multicast connection
            s = new MulticastSocket(port);
            group = InetAddress.getByName(ip);
            s.joinGroup(group);
            System.out.println("Me uni");    
            
        } catch (IOException ex) {
            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        System.out.println("Mandando monstruo");
        int x = (int) Math.random()*4;
        int y = (int) Math.random()*4;

        String pos = x + "," + y + "," + ronda;

        try {
            byte [] m = pos.getBytes();
            DatagramPacket messageOut = new DatagramPacket(m, m.length, group, port);
            s.send(messageOut);
        } catch (IOException ex) {
            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
