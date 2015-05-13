package pokerBase;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
public class Table {
	@XmlElement
	private UUID TableID;
	@XmlElement
	private ArrayList<GamePlay> TableGame = new ArrayList<GamePlay>();
	@XmlElement (name = "TablePlayerID")
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	
	public Table()
	{
		this.TableID = UUID.randomUUID();
	}
	
	public UUID GetTableID()
	{
		return this.TableID;
	}
	
	public void AddGame(GamePlay g)
	{
		TableGame.add(g);
	}
	
	public void RemoveGame(GamePlay g)
	{
		TableGame.remove(g);
	}
	
	public ArrayList<GamePlay> GetGames()
	{
		return TableGame;
	}
	
	public void AddTablePlayer(Player p)
	{
		TablePlayers.add(p);
	}
	
	public void RemoveTablePlayer(Player p)
	{
		TablePlayers.remove(p);
	}
	
	public ArrayList<Player> GetTablePlayers()
	{
		return TablePlayers;
	}
	

	public StringWriter SerializeMe()
	{
	    StringWriter sw = new StringWriter();
		try
		{
		    //Write it
		    JAXBContext ctx = JAXBContext.newInstance(Table.class);
		    Marshaller m = ctx.createMarshaller();
		    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    m.marshal(this, sw);
		    sw.close();			
		}
		catch (Exception ex)
		{
			
		}
    
    return sw;
    
	}

    
    
    
}
