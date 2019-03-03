/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author andreamarin
 */
public class ClientTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        
        GameClient client = new GameClient();
        
        if (client.empezar("228.5.6.7", 6789)){
            client.juega();
        }else{
            System.out.println("Error de conexión");
        }
    }
    
}
