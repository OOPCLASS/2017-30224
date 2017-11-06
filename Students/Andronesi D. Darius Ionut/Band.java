package lab;

public class Band {
	private String BandName;
	private Instrument[] requiredInstrument;
	private Musician[] musicians=new Musician[5];

	public Band(Instrument[] requiredInstrument, String BandName) {
		this.BandName = BandName;
		this.requiredInstrument = requiredInstrument;
	}

	public String getName() {
		return this.BandName;
	}

	public void setName(String BandName) {
		this.BandName = BandName;
	}

	public boolean doesNeed(Instrument instrument) {
		for (int i = 0; i < requiredInstrument.length; i++) {
			if (instrument == requiredInstrument[i]) {
				requiredInstrument[i] = null;
				return true;
			} 
		}
		return false;
	}

	public boolean addMusician(Musician musician) {
		boolean f = false;
		for (int i = 0; i < musicians.length; i++) {
			if (musicians[i] == null && doesNeed(musician.getInstrument())) {
				musicians[i] = musician;
				f = true;
			}
		}
		if (f) {
			System.out.println( musician.getName()+" Esti in trupa:" + BandName );
		} else
			System.out.println("Nu e nevoie");
		return f;

	}
}

	
