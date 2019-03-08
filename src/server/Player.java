/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.Serializable;

/**
 *
 * @author Andrea Marín y Luis Felipe Landa
 */
public class Player implements Serializable{
    private String id;
    private int hits;
    private boolean logged;
    
    public Player(String id){
        this.id = id;
    }
    
    public Player(String id, int hits){
        this.id = id;
        this.hits = hits;
    }
    
    public int increaseHits(){
        hits++;
        
        return hits;
    }
    
    public void resetHits(){
        hits = 0;
    }
    
    public int getHits(){
        return hits;
    }
    
    public String getId(){
        return id;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
    
    @Override 
    public boolean equals(Object o){
       return o.getClass() == this.getClass() && ((Player)o).getId().equals(this.id);
    }
    
    
}

