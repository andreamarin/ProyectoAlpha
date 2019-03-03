/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMARINA
 */
public class TcpConnection extends Thread{
    GameBoard board;
    ServerSocket tcpSocket;
    Socket clientSocket;
    
    GameServer server;
    
    public TcpConnection(int port, GameBoard board){
        this.board = board;
        
        try {
            tcpSocket = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run(){
        try {
            // Espera conexiones de clientes
            while(true) {
                
                System.out.println("Waiting for clients...");
                clientSocket = tcpSocket.accept(); 
                Connection c = new Connection(clientSocket);
                c.start();
                
            }
        } catch (IOException ex) {
            Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private class Connection extends Thread{
        private Socket client;
        private DataInputStream in;
        
        public Connection(Socket client){
            try {
                this.client = client;
                in = new DataInputStream(client.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @Override
        public void run(){
            try {
                while(true){
                    String data = in.readUTF();
                    System.out.println("=*30");
                    System.out.println("Respuesta:"+data);
                    System.out.println("Message received from: " + client.getRemoteSocketAddress());
                    System.out.println("=*30");
                }
            } catch (IOException ex) {
                Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


