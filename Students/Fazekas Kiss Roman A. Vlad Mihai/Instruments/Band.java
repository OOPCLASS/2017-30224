
public class Band {
	private String name;
	private int indexMusician = 0;
	private Musician[] musicians = new Musician[10];
	private Instrument[] requiredInstruments = { Instrument.GUITAR, Instrument.BASS, Instrument.VOICE, Instrument.DRUMS };
	public static int indexMissingInstruments = 0;

	public boolean addMusician(Musician musician) {
		for (int i = 0; i < indexMusician; i++) {
			if (musician.getInstrument().equals(musicians[i].getInstrument())) {
				return false;
			}
		}
		musicians[indexMusician] = musician;
		indexMusician++;
		return true;
	}

	public void numberOfMusiciansInBand() {
		System.out.println("There are " + indexMusician + " musicians in the band");
	}

	public String getName() {
		return name;
	}

	public Band(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrument[] getMissingInstruments() {
		Instrument[] missingInstruments = new Instrument[3];

		for (int i = 0; i < requiredInstruments.length; i++) {
			boolean test = false;
			for (int j = 0; j < indexMusician; j++) {
				if (requiredInstruments[i].equals(musicians[j].getInstrument()) == true) {
					test = true;
				}
			}
			if (test == false) {
				missingInstruments[indexMissingInstruments] = requiredInstruments[i];
				indexMissingInstruments++;
			}
		}
		return missingInstruments;
	}

}
