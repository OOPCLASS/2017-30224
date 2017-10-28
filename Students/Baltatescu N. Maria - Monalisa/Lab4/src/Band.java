
public class Band {
	private Instrument[] requiredInstrument;
	private Musician[] members;
	private String bandName;

	public Band() {

	}

	public Band(Instrument[] requiredInstrument) {
		this.members = new Musician[requiredInstrument.length];
		this.requiredInstrument = requiredInstrument;
	}

	public void setName(String bandName) {
		this.bandName = bandName;
	}

	public String getName() {
		return bandName;
	}

	public boolean addMusician(Musician musician) {
		boolean done = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null && doesNeed(musician.getInstrument())) {
				members[i] = musician;
				done = true;
			}
		}
		if (done)
			System.out.println("Trupa " + bandName + " te-a acceptat, " + musician.getName());
		else
			System.out.println("Trupa " + bandName + " nu te-a acceptat, " + musician.getName() +  ". Exista deja in trupa un membru care canta la " + musician.getInstrument());
		return done;
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

	public boolean fireMusician(Musician musician) {
		for (int i = 0; i < members.length; i++) {
			if (members[i].equals(musician)) {
				requiredInstrument[i] = musician.getInstrument();
				members[i] = null;
				System.out.println("Ai fost concediat/a, " + musician.getName());
				return true;
			}
		}
		return false;
	}

}
