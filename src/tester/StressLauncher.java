/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andreamarin
 */
public class StressLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        TestClient c;
        long sleep;
        double p;
        for (int i = 0; i < 50; i++) {
            if(i > 100){
                sleep = 0;
                
                if(i >140)
                    sleep = 0;
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(StressLauncher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println("Cliente: "+i);
            p = Math.random();
            
            if(p > 0.6){
                sleep = 0;
            }else{
                sleep = 0;
            }
            
            c = new TestClient(20,sleep);
            c.start();
        }
    }
    
}
