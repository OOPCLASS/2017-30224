
public class Main {

	public static void main(String[] args) {

		Musician m = new Musician("AAA", Instrument.BASS);
		Musician m1 = new Musician("BBB", Instrument.BASS);
		Musician m2 = new Musician("CCC", Instrument.DRUMS);
		Band b = new Band("Band Name 1");
		b.addMusician(m);
		b.addMusician(m1);
		b.addMusician(m2);
		b.numberOfMusiciansInBand();
		Instrument[] x;
		x = b.getMissingInstruments();
		
		System.out.print("The missing instruments in the band are: ");
		for (int i = 0; i < b.indexMissingInstruments; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
