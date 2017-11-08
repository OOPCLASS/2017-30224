
public class Musician {
	private Instrument instrument;
	private String userName;

	public Musician(String userName, Instrument instrument) {
		this.userName = userName;
		this.instrument = instrument;
	}

	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
