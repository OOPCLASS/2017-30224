
public class Musician {

	private String name;
	private Instrument instrument;
	
	public Musician()
	{
		this.name = "Nimea-n Drum";
		this.instrument = instrument.DEFAULT; 
	}
	
	public Musician(String name, Instrument instrument)
	{
		this.name = name;
		this.instrument = instrument;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setInstrument(Instrument instrument)
	{
		this.instrument=instrument;
	}
}
