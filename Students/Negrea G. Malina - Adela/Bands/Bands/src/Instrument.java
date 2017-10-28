
public enum Instrument {

	GUITAR("chitara electrica"), BASS("bass"), VOICE("voce"), PIANO("pian"), DRUMS("tobe");
	private String name;

	private Instrument(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

}
