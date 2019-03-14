/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import interfaces.Connection;
import interfaces.Login;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andreamarin
 */
public class TestClient extends Thread{
    private long sleep = 0;
    private static int ID = 0;
    private String playerID;
    private int roundLimit;
    // multicast settings
    private MulticastSocket multSocket;
    private InetAddress group;
    
    // tcp settings
    private Socket tcpSocket;
    private DataOutputStream out;
    private String tcpIP;
    private int tcpPort;
    
    private int round;
    private String pos;
    
    public TestClient(int roundLimit){
        try {
            this.roundLimit = roundLimit;
            
            Registry registry = LocateRegistry.getRegistry("localhost");
            Login log = (Login)registry.lookup("Login");
            Connection con = log.conecta(ID + "");
            ID++;
            playerID = con.getPlayerID();
            conectar(con.getMultIP(), con.getMultPort(), con.getTcpIP(), con.getTcpPort());
            
        } catch (RemoteException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean conectar(String multIP, int multPort, String tcpIP, int tcpPort){
        try {
            this.tcpIP = tcpIP;
            this.tcpPort = tcpPort;
            
            //multicast connection
            this.group = InetAddress.getByName(multIP);
            this.multSocket = new MulticastSocket(multPort);
            multSocket.joinGroup(group);
            
            return true;
        } catch (UnknownHostException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
    }
    
    @Override
    public void run(){
        PrintWriter writerErrores = null;
        try {
            writerErrores = new PrintWriter(new FileWriter("Errores80.csv",true));
            byte[] buffer;
            DatagramPacket mole;
            double p;
            String[] res;
            
            for (int i = 0; i < roundLimit; i++) {
                buffer = new byte[1000];
                mole = new DatagramPacket(buffer, buffer.length);
                //System.out.println("Esperando mensajes");
                multSocket.receive(mole);
                
                res = (new String(mole.getData(), 0, mole.getLength())).split(",");
                
                if(res.length == 1){
                    continue;
                }
                
                long OGTime = Long.parseLong(res[3]);
                
                p = Math.random();
                
                if(p>0.8){
                    round = 10;
                }else{
                    round = Integer.parseInt(res[2]);
                }
                
                this.tcpSocket = new  Socket(tcpIP, tcpPort);
                this.out = new DataOutputStream(tcpSocket.getOutputStream());
                
                out.writeUTF(playerID);
                out.writeInt(round);
                out.writeLong(OGTime);
                
                
                this.tcpSocket.close();
                
            }
            
            multSocket.leaveGroup(group);
            multSocket.close();
            
            //tcp connection
            this.tcpSocket = new  Socket(tcpIP, tcpPort);
            this.out = new DataOutputStream(tcpSocket.getOutputStream());
            out.writeUTF(playerID);
            out.writeInt(-1);
            out.writeLong(-1);
            tcpSocket.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
            writerErrores.print("1,");
        }finally{
            writerErrores.close();
        }
    }
  
    
}
