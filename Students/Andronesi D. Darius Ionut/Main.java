package lab;

public class Main {

	public static void main(String[] args) {
		Instrument [] band1Instruments={Instrument.GUITAR,Instrument.BASS,Instrument.DRUMS,Instrument.VOICE};
		Band band1=new Band(band1Instruments,"BANDA1");
		
		Instrument musicianInstrument=Instrument.BASS;
		Musician m1=new Musician("Alin",musicianInstrument);
		
		band1.addMusician(m1);
		
		//facem alta trupa
		
		Instrument[] band2Instruments= {Instrument.GUITAR,Instrument.DRUMS};
		Band band2=new Band(band2Instruments,"BANDA2");
		
		Instrument musician1Instrument=Instrument.GUITAR;
		Musician m2=new Musician("Robert",musician1Instrument);
		band2.addMusician(m2);
		
		Instrument musician2Instrument=Instrument.DRUMS;
		Musician m3=new Musician("Darius",musician2Instrument);
		band1.addMusician(m3);
		//BANDA1 are GUITAR si DRUMS
		
		Instrument musician3Instrument=Instrument.VOICE;
		Musician m4=new Musician("Ion",musician3Instrument);
		//cautam o trupa
		
		Band[] bands=new Band[] {band1,band2};
		m4.findBand(musician3Instrument,bands );
		

	}

}
