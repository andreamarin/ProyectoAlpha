/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andreamarin
 */
public class ScoreManager extends Thread{
    private Socket client;
    private GameBoard board;
    private DataInputStream in;

    public ScoreManager(Socket client, GameBoard board){
        try {
            this.board = board;
            this.client = client;
            in = new DataInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(TcpConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        try {
            String playerID = "";
            int round;
            boolean resp;
            long TCPTime;
            long RoundTime;
            
            //PrintWriter writerTCP = new PrintWriter(new FileWriter("TiemposTCP.csv",true));
            //PrintWriter writerRound = new PrintWriter(new FileWriter("TiemposRonda.csv",true));
            
            try {
                playerID = in.readUTF();
                round = in.readInt();
                
                /*
                TCPTime = in.readLong();
                
                if(TCPTime > 0){
                    TCPTime = System.currentTimeMillis() - TCPTime;
                    writerTCP.println(TCPTime);
                }
                 */   
                System.out.println("=========================================");
                System.out.println("ID:"+playerID);
                System.out.println("Round: "+round);
                
                

                if(round == -1){
                    board.logoutPlayer(playerID);
                }

                if(round == board.getNumRonda()){
                    resp = board.increaseScore(playerID);

                    if(resp)
                        board.newRound();
                }
                
                /*
                RoundTime = in.readLong();
                
                if(RoundTime > 0){
                    RoundTime = System.currentTimeMillis() - RoundTime;
                    writerRound.println(RoundTime);
                }
                
                writerRound.close();
                writerTCP.close();
                */
                
                System.out.println("=========================================");
                
            } catch (IOException ex) {
                Logger.getLogger(ScoreManager.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                client.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    
}
