package lab;

public enum Instrument {
	GUITAR("chitara"), BASS("bas"), DRUMS("tobe"), VOICE("voce");
	private String name;

	private Instrument(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
