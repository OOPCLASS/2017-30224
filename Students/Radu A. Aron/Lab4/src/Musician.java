
public class Musician 
{
	private String username;
	private Instrument instrument;
	
	
	public Musician (String username, Instrument instrument)
	{
		this.username = username;
		this.instrument = instrument;
	}
	
	public Instrument getInstrument ()
	{
		return this.instrument;
	}
	
	public void setInstrument (Instrument instrument)
	{
		this.instrument = instrument;
	}
	
	public String getUsername ()
	{
		return this.username;
	}
	
	public void setUsername (String username)
	{
		this.username = username;
	}
}
