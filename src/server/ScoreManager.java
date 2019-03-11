/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.IOException;
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
                //board.printBoard();
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
