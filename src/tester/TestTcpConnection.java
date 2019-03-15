/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.GameBoard;

/**
 *
 * @author AMARINA
 */
public class TestTcpConnection extends Thread{
    GameBoard board;
    ServerSocket tcpSocket;
    TestGameServer server;
    
    public TestTcpConnection(int port, GameBoard board){
        this.board = board;
        try {
            tcpSocket = new ServerSocket(port, 350);
        } catch (IOException ex) {
            Logger.getLogger(TestTcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void run(){
        try {
            // Espera conexiones de clientes
            while(true) {
                Socket clientSocket = tcpSocket.accept(); 
                TestScoreManager sm = new TestScoreManager(clientSocket, board);
                sm.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(TestTcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                tcpSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(TestTcpConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


