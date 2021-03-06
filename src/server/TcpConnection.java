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
    GameServer server;
    
    public TcpConnection(int port, GameBoard board){
        this.board = board;
        try {
            tcpSocket = new ServerSocket(port, 150);
        } catch (IOException ex) {
            Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run(){
        try {
            // Espera conexiones de clientes
            while(true) {
                Socket clientSocket = tcpSocket.accept(); 
                ScoreManager sm = new ScoreManager(clientSocket, board);
                sm.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                tcpSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


