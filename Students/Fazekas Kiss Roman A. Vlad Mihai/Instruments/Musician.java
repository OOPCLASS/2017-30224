
public class Musician {
	private String username;
	private Instrument instrument;

	public Musician(String username, Instrument instrument) {
		this.username = username;
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public Musician() {

	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
