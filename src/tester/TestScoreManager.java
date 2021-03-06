/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.GameBoard;

/**
 *
 * @author andreamarin
 */
public class TestScoreManager extends Thread{
    private Socket client;
    private GameBoard board;
    private DataInputStream in;

    public TestScoreManager(Socket client, GameBoard board){
        try {
            this.board = board;
            this.client = client;
            in = new DataInputStream(client.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(TestScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        try {
            String playerID = "";
            int round;
            boolean resp;
            long RoundTime;
            
            PrintWriter writerRound = new PrintWriter(new FileWriter("TiemposRonda100.csv",true));
            
            try {
                playerID = in.readUTF();
                round = in.readInt();
                  
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
                
                
                RoundTime = in.readLong();
                
                if(RoundTime > 0){
                    RoundTime = System.currentTimeMillis() - RoundTime;
                    writerRound.print(RoundTime + ",");
                }
                
                writerRound.close();
                
                System.out.println("=========================================");
                
            } catch (IOException ex) {
                Logger.getLogger(TestScoreManager.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                client.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(TestScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    
}
