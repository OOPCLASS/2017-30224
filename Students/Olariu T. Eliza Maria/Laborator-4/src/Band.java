
public class Band {

	private String name;
	private Musician[] musicians = new Musician[10];
	private Instrument[] requiredInstruments = new Instrument[10];
	private Instrument[] missingInstruments = new Instrument[10];

	private int indexMusician = 0;
	private int indexRequired = 3;
	public int indexMissing = indexRequired;
	public boolean bandComplet = false;

	public Band(String name) {
		this.name = name;
	}

	public Band(String name, Instrument[] requiredInstruments) {
		this.name = name;
		this.requiredInstruments = requiredInstruments;
	}

	public String getName() {
		return this.name;
	}

	public boolean addMusician(Musician musician) {
		boolean isGood = false;
		int i;

		for (i = 0; i < indexRequired; i++) {
			if (musician.getInstrument().equals(requiredInstruments[i]))
				isGood = true;
		}
		for (i = 0; i < indexMusician; i++) {
			if (musician.getInstrument().equals(musicians[i].getInstrument()))
				isGood = false;
		}

		if (isGood == true) {
			musicians[indexMusician] = musician;
			indexMusician++;
			if (indexMusician == indexRequired) {
				bandComplet = true;
			}
			return true;
		} else {
			return false;
		}
	}

	public Instrument[] getMissingInstruments() {
		int i, j, k;
		boolean isBoth;

		k = 0;
		for (i = 0; i < indexRequired; i++) {
			isBoth = false;
			for (j = 0; j < indexMusician; j++) {
				if (requiredInstruments[i].equals(musicians[j].getInstrument()))
					isBoth = true;
			}
			if (isBoth == false) {
				missingInstruments[k] = requiredInstruments[i];
				k++;
			}
		}
		indexMissing = k;
		return missingInstruments;

	}

	public void writeMusician() {
		int i;
		boolean flagWrite = false;

		System.out.println("Muzicieni actuali:");
		for (i = 0; i < indexMusician; i++) {
			System.out.print(musicians[i].getUserName() + ", ");
			flagWrite = true;
		}
		if (flagWrite == true) {
			System.out.println();
		} else {
			System.out.println("Nu sunt muzicieni!");
		}
	}

}
