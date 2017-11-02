
public enum Instrument {

	DEFAULT("Not Specified"),
	GUITAR("Guitar"),
	BASS("Bass"),
	DRUMS("Drums"),
	VOICE("Voice");
	
	private String name;
	
	private Instrument(String name)
	{this.name=name;}
	
	public String getName()
	{
		return name;
	}
	
}
