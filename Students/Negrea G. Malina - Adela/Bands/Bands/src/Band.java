
public class Band {

	private String name;
	private Musician[] musicians = new Musician[10];
	private Instrument[] requiredInstruments = new Instrument[10];
	private int[] nbInstrument = new int[5];
	private int indexMusician = 0;
	private int indexInstruments = 0;

	public Band(Instrument[] requiredInstruments, int length, String name) {
		this.requiredInstruments = requiredInstruments;
		indexInstruments = length;
		incrementation();
		this.name = name;

	}

	public boolean addMusicians(Musician musician) {
		if (needInstrument(musician.getInstrument())) {
			musicians[indexMusician] = musician;
			indexMusician++;
			nbInstrument[getIndex(musician.getInstrument())]--;
			return true;
		}
		return false;

	}

	private void incrementation() {

		for (int i = 0; i < indexInstruments; i++) {
			nbInstrument[getIndex(requiredInstruments[i])]++;
		}
	}

	private int getIndex(Instrument instrument) {
		switch (instrument) {
		case GUITAR:
			return 0;
		case BASS:
			return 1;
		case VOICE:
			return 2;
		case PIANO:
			return 3;
		default:
			return 4;

		}

	}

	private boolean needInstrument(Instrument instrument) {

		if (nbInstrument[getIndex(instrument)] > 0) {
			return true;
		}
		return false;
	}

	private Instrument detInstrument(int k) {
		switch (k) {
		case 0:
			return Instrument.GUITAR;
		case 1:
			return Instrument.BASS;
		case 2:
			return Instrument.VOICE;
		case 3:
			return Instrument.PIANO;
		default:
			return Instrument.DRUMS;

		}
	}

	public Instrument[] getMissingInstruments() {
		Instrument[] instruments = new Instrument[10];
		int k = 0;
		int i;

		for (i = 0; i < 5; i++) {
			if (nbInstrument[i] > 0) {
				instruments[k] = detInstrument(i);
				k++;
			}
		}

		return instruments;

	}

	public String getName() {
		return name;

	}

}
