
public enum Instrument {

	GUITAR("electric guitar"), BASS("bass"), VOICE("voice"), PIANO("piano"), DRUMS("drums");

	private String name;

	private Instrument(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNume() {
		return this.name;
	}
}
