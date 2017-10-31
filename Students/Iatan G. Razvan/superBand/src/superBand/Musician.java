package superBand;

public class Musician {
	private String name;
	private Instrument instrument;

	public Musician(String name, Instrument instrument) {
		this.name = "Default";
		this.instrument = instrument;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}
}
