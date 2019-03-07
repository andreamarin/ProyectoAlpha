/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
/**
 *
 * @author andreamarin
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        Player p3 = new Player("p1");
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
    
}
