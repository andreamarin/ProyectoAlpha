/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
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
    private final int MAX_HITS = 3;
    private int numLogs = 0;
    
    public GameBoard(){
        numRonda = 0;
        fin = false;
        ganador = null;
        players = new ArrayList<>();
        
    }
    
    public void printPlayers(){
        System.out.println("============================");
        for (Player player : players) {
            System.out.println(player.getId());
        }
        System.out.println("============================");
    }
    
    public synchronized void increaseLog(){
        numLogs ++;
    }
    
    public int getLogs(){
        return numLogs;
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
    
    public void printBoard(){
        System.out.println("***********************************************");
        for (Player player : players) {
            System.out.println(player.getId()+": "+player.getHits());
        }
        System.out.println("***********************************************");

    }
    
    public String getScores(){
        String res = "";
        
        for (Player player : players) {
            res += player.getId() + "," + player.getHits() + ",";
        }
        
        return res;
    }
    
    public Player getPlayer(String id){
        int index =  players.indexOf(new Player(id));
        Player res = null;
        if(index != -1)
            res = players.get(index);
        
        return res;
    }
    
    public Player addPlayer(String id){
        Player p = new Player(id);
        p.setLogged(true);
        
        players.add(p);
        return p;
    }
    
    public void logPlayer(String id){
        int index = players.indexOf(new Player(id));
        players.get(index).setLogged(true);
    }
    
    public void logoutPlayer(String id){
        int index = players.indexOf(new Player(id));
        players.get(index).setLogged(false);
    }
    
    public synchronized boolean increaseScore(String id){
        int index = players.indexOf(new Player(id));
        int newHits;
        boolean res;
        
        if(index != -1 && !fin){
            newHits = players.get(index).increaseHits();
            
            if(newHits == MAX_HITS){ // player has won!
                ganador = players.get(index);
                fin = true;
            }
            
            res = true;
        }else{
            res = false;
        }
        
        return res;
    }
    
}
