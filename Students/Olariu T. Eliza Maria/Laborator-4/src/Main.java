
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument[] instrumentBand1 = { Instrument.GUITAR, Instrument.PIANO, Instrument.VOICE };
		Instrument[] instrumentBand2 = { Instrument.DRUMS, Instrument.BASS, Instrument.VOICE };

		Band band1 = new Band("Roth", instrumentBand1);
		Band band2 = new Band("Gradina secreta", instrumentBand2);

		Instrument[] missing = new Instrument[10];
		Musician musician1, musician2;
		InputOutput function = new InputOutput();

		musician1 = function.readMusician();

		// System.out.println(musician.getUserName() + " " +
		// musician.getInstrument().getNume());

		missing = band1.getMissingInstruments();
		function.writeMissingInstruments(missing, band1.indexMissing);
		band1.writeMusician();
		band1.addMusician(musician1);
		band1.writeMusician();
		missing = band1.getMissingInstruments();
		function.writeMissingInstruments(missing, band1.indexMissing);
		band1.addMusician(musician1);
		band1.writeMusician();

		musician2 = function.readMusician();

		missing = band2.getMissingInstruments();
		function.writeMissingInstruments(missing, band2.indexMissing);
		band2.writeMusician();
		band2.addMusician(musician2);
		band2.writeMusician();
		missing = band2.getMissingInstruments();
		function.writeMissingInstruments(missing, band2.indexMissing);
		band2.addMusician(musician2);
		band2.writeMusician();

		if (band1.bandComplet == true) {
			System.out.println("Trupa " + band1.getName() + " este completa");
		} else {
			System.out.println("Trupa " + band1.getName() + " NU este completa");
		}
		if (band2.bandComplet == true) {
			System.out.println("Trupa " + band2.getName() + " este completa");
		} else {
			System.out.println("Trupa " + band2.getName() + " NU este completa");
		}
	}

}
