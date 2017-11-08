package superBand;

public class Band {
	private Instrument[] requiredInstrument;
	private Musician[] members;

	public Band(Instrument[] requiredInstrument, int n) {
		this.requiredInstrument = requiredInstrument;
		members = new Musician[n];

	}

	public boolean addMusician(Musician m) {
		for (int i = 0; i < members.length; i++) {
			if (doesNeed(m.getInstrument()) && members[i] == null) {
				members[i] = m;
				System.out.println(m.getName() + " Bun venit in MANELICA!!  !");
				return true;
			}

		}
		System.out.println(m.getName() + " Nu ai loc!!");
		return false;
	}

	public void removeMusician(Musician m) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] == m) {
				members[i] = null;
			}
		}
		System.out.println(m.getName() + " a fost dat afara din trupa!");
	}

	public boolean doesNeed(Instrument instrument) {
		for (int i = 0; i < requiredInstrument.length; i++) {
			if (requiredInstrument[i] == instrument) {
				return true;
			}
		}
		return false;
	}

}
