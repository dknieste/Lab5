package pokerBase;
import java.util.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import pokerAction.Action;
import pokerPlay.Client;

public class Player {
	
	@XmlElement
	private UUID PlayerID;
	@XmlElement
	private int PlayerNbr;
	@XmlElement
	private String PlayerName;
	@XmlElement
	private Hand PlayerHand;
    /** Last action performed. */
    private Action action;  
    private Client client;
    
	public Player(Client client)
	{
		this.PlayerID = UUID.randomUUID();
		this.client = client;
	}
	
	public Player(String PlayerName, Client client)
	{
		this.PlayerID = UUID.randomUUID();
		this.PlayerName = PlayerName;
		this.client = client;
	}
	
	public UUID GetPlayerID()
	{
		return this.PlayerID;		
	}
	
	public void SetHand(Hand h)
	{
		PlayerHand = h;
	}
	
	public Hand GetHand()
	{
		return PlayerHand;
	}	

	public void SetPlayerNbr(int PlayerNbr)
	{
		this.PlayerNbr = PlayerNbr;
	}
	
	public int GetPlayerNbr()
	{
		return this.PlayerNbr;
	}
	
	public void SetPlayerName(String PlayerName)
	{
		this.PlayerName = PlayerName;
	}
	
	public String GetPlayerName()
	{
		return this.PlayerName;
	}
	

    
    /**
     * Returns the player's most recent action.
     * 
     * @return The action.
     */
    public Action getAction() {
        return action;
    }
    
    /**
     * Sets the player's most recent action.
     * 
     * @param action
     *            The action.
     */
    public void setAction(Action action) {
        this.action = action;
    }
    
    public void resetHand()
    {
    	this.PlayerHand = null;
    }
    
    /**
     * Returns the client.
     * 
     * @return The client.
     */
    public Client getClient() {
        return client;
    }
    
}
