/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import interfaces.Login;
import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AMARINA
 */
public class GameServer {
    private static GameBoard board;
    
    // multicast settings
    private static int multPort = 6789;
    private static MulticastSocket s;
    private static InetAddress group;
    
    public static void main(String[] args){
        try {
            System.setProperty("java.net.preferIPv4Stack", "true");
            
            board  = new GameBoard();
            board.addPlayer("p1");
            board.addPlayer("p2");
            
            
            // multicast
            String multIP = "228.6.6.6";
            
            // multicast connection
            try {
                s = new MulticastSocket(multPort);
                group = InetAddress.getByName(multIP);
                s.joinGroup(group);
            } catch (IOException ex) {
                Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //tcp
            int tcpPort = 6780;
            String tcpIP = "localhost";
            
            //launch RMI service
            String path = System.getProperty("user.dir") + "/src/server/server.policy";
            System.setProperty("java.security.policy","file:"+path);
            
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            
            //start rmiregistry
            LocateRegistry.createRegistry(1099);
            
            LoginServer login = new LoginServer(board, multIP, multPort, tcpIP, tcpPort);
            Login stub = (Login)UnicastRemoteObject.exportObject(login, 0);
            
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Login", stub);
            
            // start thread
            TcpConnection tcpCon = new TcpConnection(tcpPort, board);
            tcpCon.start();
            
            int x, y, s;
            int ronda;
            
            long time;
            
            while(true){
                
                if(board.isFin()){
                    sendMsg("Ganó: "+board.getGanador().getId());
                    board.clearGame();
                }else{
                    
                    time = System.currentTimeMillis();
                    
                    x = 1 + (int) (Math.random() * 4);
                    y = 1 + (int) (Math.random() * 5);
                    
                    ronda = board.newRound();
                    
                    //Versión estresamiento
                    sendMsg(x+","+y+","+ronda + "," +time);
                    
                    //Versión juego
                    //sendMsg(x+","+y+","+ronda+","+board.getScores());
                    
                    System.out.println(x+","+y+","+ronda);
                    
                    // timeout
                    s = 0;
                    while(s < 5 && ronda == board.getNumRonda()){
                        try {
                            s++;
                            Thread.sleep(200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void sendMsg(String msj){
        try {
            byte [] m = msj.getBytes();
            DatagramPacket messageOut = new DatagramPacket(m, m.length, group, multPort);
            s.send(messageOut);
        } catch (IOException ex) {
            Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}