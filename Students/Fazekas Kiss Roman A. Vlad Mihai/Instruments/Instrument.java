
public enum Instrument {
	GUITAR("electric guitar"),
	BASS("bass"),
	VOICE("soprana"),
	PIANO("piano"),
	DRUMS("drums");

	private String name;

	private Instrument(String name) {
	}

	public String getName() {
		return name;
	}
}
