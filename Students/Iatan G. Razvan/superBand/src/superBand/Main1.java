package superBand;

public class Main {

	public static void main(String[] args) {

		Musician m1 = new Musician("Default", Instrument.GUITAR);
		Musician m2 = new Musician("Default", Instrument.BASS);
		Musician m3 = new Musician("Default", Instrument.VOICE);
		Musician m4 = new Musician("Default", Instrument.DRUMS);
		Musician m5 = new Musician("Default", Instrument.GUITAR);
		m1.setName("Andrei");
		m2.setName("Razvan");
		m3.setName("Calin");
		m4.setName("Ana");
		m5.setName("Mario");
		Instrument[] instr = { Instrument.GUITAR, Instrument.BASS, Instrument.VOICE };
		Band Manelica = new Band(instr, 3);
		System.out.println(
				m1.getInstrument() + " " + m2.getInstrument() + " " + m4.getInstrument() + " " + m3.getInstrument());
		Manelica.addMusician(m1);
		Manelica.addMusician(m2);
		Manelica.addMusician(m3);
		Manelica.addMusician(m4);
		Manelica.removeMusician(m1);
		Manelica.addMusician(m5);

	}
}
