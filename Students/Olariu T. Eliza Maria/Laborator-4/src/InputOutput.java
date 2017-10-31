import java.util.Scanner;

public class InputOutput {

	public Musician readMusician() {
		String nameMusician;
		String nameInstrumentMusician;

		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti numele muzicianului");
		nameMusician = in.next();
		System.out.println("Introduceti instrumentul");
		nameInstrumentMusician = in.next();
		Musician musician = null;

		switch (nameInstrumentMusician) {
		case "GUITAR":
			musician = new Musician(nameMusician, Instrument.GUITAR);
			break;
		case "BASS":
			musician = new Musician(nameMusician, Instrument.BASS);
			break;
		case "DRUMS":
			musician = new Musician(nameMusician, Instrument.DRUMS);
			break;
		case "PIANO":
			musician = new Musician(nameMusician, Instrument.PIANO);
			break;
		case "VOICE":
			musician = new Musician(nameMusician, Instrument.VOICE);
			break;
		default:
			System.out.println("Instrument negasit");
			break;
		}
		return musician;
	}

	public void writeMissingInstruments(Instrument[] missing, int index) {
		int i;

		System.out.println("Instrumentele care lipsesc:");
		for (i = 0; i < index; i++) {
			System.out.println(missing[i].getNume());
		}
	}
}
