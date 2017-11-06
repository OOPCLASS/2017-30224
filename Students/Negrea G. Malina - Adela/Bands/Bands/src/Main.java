
public class Main {

	public static void main(String[] args) {

		Musician[] musician = new Musician[10];
		musician[0] = new Musician("Andrei", Instrument.PIANO);
		musician[1] = new Musician("Ana", Instrument.VOICE);
		musician[2] = new Musician("Bogdan", Instrument.BASS);
		musician[3] = new Musician("Maria", Instrument.GUITAR);
		musician[4] = new Musician("Alex", Instrument.DRUMS);
		musician[5] = new Musician("Marius", Instrument.VOICE);
		int nbMusicians = 6;
		boolean[] recruited = new boolean[10];

		Band[] band = new Band[10];

		Instrument[] instr1 = new Instrument[] { Instrument.BASS, Instrument.PIANO, Instrument.VOICE };
		band[0] = new Band(instr1, 3, "Band1");

		Instrument[] instr2 = new Instrument[] { Instrument.GUITAR, Instrument.VOICE };
		band[1] = new Band(instr2, 2, "Band2");

		Instrument[] instr3 = new Instrument[] { Instrument.DRUMS, Instrument.BASS, Instrument.VOICE };
		band[2] = new Band(instr3, 3, "Band3");
		int nbBands = 3;

		int i, ct, j, k;
		Instrument[] instruments = new Instrument[] { Instrument.GUITAR, Instrument.BASS, Instrument.VOICE,
				Instrument.PIANO, Instrument.DRUMS };

		for (i = 0; i < 5; i++) {
			ct = 0;
			for (j = 0; j < nbMusicians; j++) {
				if (musician[j].getInstrument().equals(instruments[i])) {
					ct++;
				}
			}
			System.out.println("Exista " + ct + " persoane care canta la " + instruments[i].getName());

		}

		System.out.println();

		for (i = 0; i < nbBands; i++) {
			Instrument[] instr;
			instr = band[i].getMissingInstruments();
			System.out.println("Trupa " + band[i].getName() + " mai are nevoie de urmatoarele instrumente:");
			j = 0;
			while (instr[j] != null) {
				System.out.print(instr[j].getName() + " , ");
				j++;
			}
			System.out.println(" ");
		}

		System.out.println();

		for (i = 0; i < nbMusicians; i++) {
			if (recruited[i] == false) {
				System.out.println(musician[i].getName() + " poate participa la auditiile trupelor:");
				for (j = 0; j < nbBands; j++) {
					Instrument[] instr;
					instr = band[j].getMissingInstruments();
					k = 0;
					while (instr[k] != null) {
						if (instr[k].equals(musician[i].getInstrument())) {
							System.out.print(band[j].getName() + " ");
							break;
						}
						k++;

					}
				}
			} else {
				System.out.println(musician[i].getName() + " a fost recruatat ");
			}
			System.out.println();
		}
		System.out.println();

		if (band[0].addMusicians(musician[0])) {
			System.out.println(musician[0].getName() + " a fost recrtutat in trupa " + band[0].getName());
			recruited[0] = true;
		} else {
			System.out.println(musician[0].getName() + " nu a putut fi adaugat in trupa " + band[0].getName());
		}

		System.out.println();

		if (band[1].addMusicians(musician[1])) {
			System.out.println(musician[1].getName() + " a fost recrtutat in trupa " + band[1].getName());
			recruited[1] = true;
		} else {
			System.out.println(musician[1].getName() + " nu a putut fi adaugat in trupa " + band[1].getName());
		}

		System.out.println();

		if (band[1].addMusicians(musician[2])) {
			System.out.println(musician[2].getName() + " a fost recrtutat in trupa " + band[1].getName());
			recruited[2] = true;
		} else {
			System.out.println(musician[2].getName() + " nu a putut fi adaugat in trupa " + band[1].getName());
		}

		System.out.println();

		if (band[2].addMusicians(musician[2])) {
			System.out.println(musician[2].getName() + " a fost recrtutat in trupa " + band[2].getName());
			recruited[2] = true;
		} else {
			System.out.println(musician[2].getName() + " nu a putut fi adaugat in trupa " + band[2].getName());
		}

		for (i = 0; i < nbBands; i++) {
			Instrument[] instr;
			instr = band[i].getMissingInstruments();
			System.out.println("Trupa " + band[i].getName() + " mai are nevoie de urmatoarele instrumente:");
			j = 0;
			while (instr[j] != null) {
				System.out.print(instr[j].getName() + " , ");
				j++;
			}
			System.out.println(" ");
		}

		System.out.println();

		for (i = 0; i < nbMusicians; i++) {
			if (recruited[i] == false) {
				System.out.println(musician[i].getName() + " poate participa la auditiile trupelor:");
				for (j = 0; j < nbBands; j++) {
					Instrument[] instr;
					instr = band[j].getMissingInstruments();
					k = 0;
					while (instr[k] != null) {
						if (instr[k].equals(musician[i].getInstrument())) {
							System.out.print(band[j].getName() + " ");
							break;
						}
						k++;

					}
				}
			} else {
				System.out.println(musician[i].getName() + " a fost recruatat ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
