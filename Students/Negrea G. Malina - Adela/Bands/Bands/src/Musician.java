
public class Musician {
	private Instrument instrument;
	private String username;
	
	public Musician(String username,Instrument intrument){
		this.username=username;
		this.instrument=intrument;
	}
	
	public Instrument getInstrument(){
		return this.instrument;
		
	}
	
	public void setInstrument(Instrument instrument){
		this.instrument=instrument;
		
	}
	
	public String getName(){
		return username;
	}
}
