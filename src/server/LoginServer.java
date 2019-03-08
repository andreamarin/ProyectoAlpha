/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import interfaces.Connection;
import interfaces.Login;
import java.rmi.RemoteException;

/**
 *
 * @author andreamarin
 */
public class LoginServer implements Login{
    GameBoard board;
    private String multIP;
    private int multPort;
    private String tcpIP;
    private int tcpPort;

    public LoginServer(GameBoard board, String multIP, int multPort, String tcpIP, int tcpPort) {
        super();
        this.board = board;
        this.multIP = multIP;
        this.multPort = multPort;
        this.tcpIP = tcpIP;
        this.tcpPort = tcpPort;
    }
    
    @Override
    public Connection conecta(String username) throws RemoteException {
        Player p = board.getPlayer(username);
        
        if (p == null){
            p = board.addPlayer(username);
        }else if(p.isLogged()){
            p = null;
        }else{
            board.logPlayer(username);
        }
        
        String id = (p==null) ? p.getId() : null;
        
        return new Connection(id, multIP, multPort, tcpIP, tcpPort);
    }
    
}
