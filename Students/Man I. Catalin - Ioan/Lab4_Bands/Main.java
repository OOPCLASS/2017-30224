
public class Main {

	public static void main(String[] args) {
		
		Instrument[] needed = new Instrument[2];
		Musician[] existingBand1 = new Musician[3];
		
		existingBand1[0]=new Musician("Ion", Instrument.BASS);
		existingBand1[1]=new Musician("Marie", Instrument.DRUMS);
		existingBand1[2]=new Musician("Gheorghe", Instrument.VOICE);
		needed[0]=Instrument.GUITAR;
		needed[1]=Instrument.VOICE;
		
		Band band1 = new Band(5, existingBand1, needed);
		
		band1.showMissingInstruments();
		band1.addMusician(Instrument.BASS);
		band1.showBandMembers();
		band1.showMissingInstruments();
	

	}

}
