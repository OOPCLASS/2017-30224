
public enum Instrument 
{
	GUITAR("G"),
	BASS("B"),
	VOICE("V"),
	PIANO("P"),
	DRUMS("D");
	private String name;
	
	private Instrument (String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
}
