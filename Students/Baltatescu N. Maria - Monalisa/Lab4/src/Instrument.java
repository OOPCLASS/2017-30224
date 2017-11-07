
public enum Instrument {
	GUITAR("chitara"),
	BASS("bass"),
	DRUMS("tobe"),
	VOICE("voce");
	private String name;
	
	private Instrument(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
}
