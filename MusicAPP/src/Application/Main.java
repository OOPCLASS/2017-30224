package Application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int numberOfMembers;
		Scanner in = new Scanner(System.in);
		numberOfMembers = 4;

		Instrument[] instruments = new Instrument[numberOfMembers];

		instruments[0] = Instrument.BASS;
		instruments[1] = Instrument.VOICE;
		instruments[2] = Instrument.GUITAR;
		instruments[3] = Instrument.DRUMS;

		Band rock = new Band(numberOfMembers, instruments);
		Musician M1 = new Musician("deff", Instrument.BASS);
		Musician M2 = new Musician("deff", Instrument.VOICE);
		Musician M3 = new Musician("deff", Instrument.GUITAR);
		Musician M4 = new Musician("deff", Instrument.DRUMS);
		Musician M5 = new Musician("deff", Instrument.BASS);
		rock.addMusician(M1);
		rock.addMusician(M2);
		rock.addMusician(M3);
		rock.addMusician(M4);
		rock.addMusician(M5);
		//rock.addMusician(M2);

	}
}
