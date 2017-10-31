package Application;

public class Band {

	private Instrument[] requiredInstrument;
	private Musician[] members;

	public Band(int numberOfMembers, Instrument[] instruments) {
		this.members = new Musician[numberOfMembers];
		this.requiredInstrument = new Instrument[numberOfMembers];

		this.requiredInstrument = instruments;

	}

	public boolean addMusician(Musician M) {
		for(int i = 0; i < members.length; i++) {
			if(needInstruments(M.getInstrument()) && members[i] == null ) {
				members[i] = M;
				System.out.println("Bun Venit");
				return true;
			}
		}
		System.out.println("Nu mai este loc, trupa e completa!");
		return false;
	}	
	

	public boolean needInstruments(Instrument instrument) {
		for( int i = 0; i < requiredInstrument.length; i++) {
			if(instrument.equals(requiredInstrument[i]))
				return true;
		}
		return false;	
	}
}
	

