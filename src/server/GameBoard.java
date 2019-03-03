/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import interfaces.Player;
import java.util.ArrayList;

/**
 *
 * @author andreamarin
 */
public class GameBoard {
    private int numRonda;
    private boolean fin;
    private Player ganador;
    private ArrayList<Player> players;
    
    public GameBoard(){
        numRonda = 0;
        fin = false;
        ganador = null;
        players = new ArrayList<>();
        
        initPlayers();
    }
    
   private void initPlayers(){
       players.add(new Player("p1"));
       players.add(new Player("p2"));
   }
    
    // GETTERS AND SETTERS
    
    public int getNumRonda() {
        return numRonda;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public Player getGanador() {
        return ganador;
    }
    
    
    // CLASS METHODS
    
    public int newRound() {
        numRonda = (numRonda + 1) % 10;
        return numRonda;
    }
    
    public void clearGame(){
        for (Player player : players) {
            player.resetHits();
        }
        fin = false;
        ganador = null;
    }
}
