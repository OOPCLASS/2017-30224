
public class Musician {
	private String name;
	private Instrument instrument;
	
	public Musician(Instrument instrument) {
		this.instrument=instrument;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}
	
	public void findBand(Instrument instrument, Band[] bands) {
		System.out.println("Ce trupa are nevoie de un instrumentist pentru " + instrument + "?");
		for( int i=0; i<bands.length; i++) {
			if(bands[i].doesNeed(instrument)) {
				System.out.println("Trupa " + bands[i].getName() + " este disponibila");
			}
			else
				System.out.println("Trupa " +  bands[i].getName() + " NU este dispoibila!");
		}
	}
}

