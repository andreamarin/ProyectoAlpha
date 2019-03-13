/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.io.Serializable;

/**
 *
 * @author andreamarin
 */
public class Connection implements Serializable{
    private String playerID;
    private String multIP;
    private int multPort;
    private String tcpIP;
    private int tcpPort;
    private int score;

    public Connection(int score, String playerID, String multIP, int multPort, String tcpIP, int tcpPort) {
        this.playerID = playerID;
        this.multIP = multIP;
        this.multPort = multPort;
        this.tcpIP = tcpIP;
        this.tcpPort = tcpPort;
        this.score = score;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getMultIP() {
        return multIP;
    }

    public int getMultPort() {
        return multPort;
    }

    public String getTcpIP() {
        return tcpIP;
    }

    public int getTcpPort() {
        return tcpPort;
    }

    public int getScore() {
        return score;
    }
}
