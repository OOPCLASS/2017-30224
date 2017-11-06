
public class Main {

	public static void main(String[] args) 
	{
		Instrument[] reqInstruments = {Instrument.BASS, Instrument.GUITAR, Instrument.DRUMS};
		
		Band firstBand = new Band ("no1", 3, reqInstruments);
		
		Musician musicianNo1 = new Musician("name1", Instrument.BASS);
		Musician musicianNo2 = new Musician("name2", Instrument.GUITAR);
		
		System.out.println(firstBand.addMusician(musicianNo1));
		System.out.println(firstBand.addMusician(musicianNo2));
		
		Instrument[] missing = firstBand.getMissingInstruments();
		
		for (Instrument missingInstrument : missing)
		{
			System.out.println(missingInstrument);
		}

	}

}
