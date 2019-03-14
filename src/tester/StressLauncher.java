/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        PrintWriter writerRound;
        PrintWriter writerErrores;
        try {
            writerRound = new PrintWriter(new FileWriter("TiemposRonda20.csv",true));
            writerRound.println("");
            writerRound.close();
            
            writerErrores = new PrintWriter(new FileWriter("Errores20.csv",true));
            writerErrores.println("");
            writerErrores.close();
        } catch (IOException ex) {
            Logger.getLogger(StressLauncher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Cliente: "+i);
            
            c = new TestClient(50);
            c.start();
        }
    }
    
}
