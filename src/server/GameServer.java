/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMARINA
 */
public class GameServer {
    public static void main(String[] args) throws IOException{
        // multicast
        int multPort = 6789;
        String multIP = "228.5.6.7";
     
        //tcp 
        ServerSocket tcpSocket;
        Socket clientSocket;
        int tcpPort = 6780;
        
        MulticastConnection mCon = new MulticastConnection(multIP, multPort);
        mCon.start();
        
        // TCP setting
        //tcpSocket = new ServerSocket(tcpPort);
        //clientSocket = tcpSocket.accept();
    }
}