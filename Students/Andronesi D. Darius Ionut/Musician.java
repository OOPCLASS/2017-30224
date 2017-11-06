package lab;

public class Musician {
	private String name;
	private Instrument instrument;

	public Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
	}

	public String getName() {
		return name;
	}

	public void seName(String name) {
		this.name = name;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void findBand(Instrument instrument, Band[] band) {
		for (int i = 0; i < band.length; i++) {
			if (band[i].doesNeed(instrument)) {
				System.out.println(
						"Trupa " + band[i].getName() + " are nevoie de un musician care canta la " + instrument);

			} else {
				System.out.println("Trupa " + band[i].getName() + " nu are nevoie de musician care canta la "+instrument);
			}
		}
	}
}
