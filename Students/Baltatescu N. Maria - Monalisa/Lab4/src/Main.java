
public class Main {

	public static void main(String[] args) {
		//Ne facem o trupa rock
		Instrument[] rockInstruments= {Instrument.BASS, Instrument.GUITAR, Instrument.DRUMS, Instrument.VOICE}; 
		Band rock=new Band(rockInstruments);
		rock.setName("Iris");
		
		//Ne facem o trupa latino
		Instrument[] latinoInstruments= {Instrument.GUITAR, Instrument.VOICE};
		 Band latino=new Band(latinoInstruments);
		 latino.setName("Despacito");
		
		//Cream un muzician care stie sa cante cu vocea
		 Instrument musician1Instrument=Instrument.VOICE;
		 Musician singer1=new Musician(musician1Instrument);
		 singer1.setName("Andrei");
		 
		 //Il adaugam in trupa rock
		 rock.addMusician(singer1);
		 
		 //Cream un muzician care sa cante la bass
		 Instrument musician2Instrument=Instrument.BASS;
		 Musician singer2=new Musician(musician2Instrument);
		 singer2.setName("Ovidiu");
		 
		 //Il adaugam in trupa rock
		 rock.addMusician(singer2);
		 
		 //Cream un muzician care sa cante la tobe
		 Instrument musician3Instrument=Instrument.DRUMS;
		 Musician singer3=new Musician(musician3Instrument);
		 singer3.setName("Larisa");
		 
		//Il adaugam in trupa rock
		 rock.addMusician(singer3);
		 
		 //Cream un muzician care sa cante cu vocea
		 Instrument musician4Instrument=Instrument.VOICE;
		 Musician singer4=new Musician(musician4Instrument);
		 singer4.setName("Monalisa");
		 
		 //Il adaugam in trupa latino
		 latino.addMusician(singer4);
		 
		 //Cream un muzician care sa cante la chitara
		 Instrument musician5Instrument=Instrument.GUITAR;
		 Musician singer5=new Musician(musician5Instrument);
		 singer5.setName("Timi");
		 
		 //Il adaugam in trupa latino
		 latino.addMusician(singer5);
		 
		 //Cream un muzician care canta la chitara
		 Instrument musician6Instrument=Instrument.GUITAR;
		 Musician singer6=new Musician(musician6Instrument);
		 
		 
		 //Vrem sa ii gasim o trupa care are nevoie de un chitarist
		 Band[] allBands=new Band[] {rock, latino};
		 singer6.findBand(musician5Instrument, allBands);
		 
		 //Trupa rock il concediaza pe muzicianul 3
		 rock.fireMusician(singer3);
		 
		 //Vrem sa testam daca locul ramas liber din trupa rock se poate ocupa
		 Instrument musician7Instrument=Instrument.DRUMS;
		 Musician singer7=new Musician(musician7Instrument);
		 singer7.setName("Mirela");
		 rock.addMusician(singer7);
		 
		 
		 //Trupa latino concediaza muzicianul 6
		 latino.fireMusician(singer6);
		 
		 
		 //Testam daca a ramas liber locul de chitarist din trupa latino si incercam sa ii gasim loc muzicianului 8
		 Instrument musician8Instrument=Instrument.GUITAR;
		 Musician singer8=new Musician(musician8Instrument);
		 singer8.setName("Ioana");
		
		 singer8.findBand(musician8Instrument, allBands);//De ce nu imi gaseste ambele trupe? Are legatura cu pozitia fiecarui intrument?
		 
		 //Testam daca trupa latino e intr-adevar ocupata
		 Instrument musician9Instrument=Instrument.GUITAR;
		 Musician singer9=new Musician(musician9Instrument);
		 singer9.setName("Andi");
		 latino.addMusician(singer9);
		
	}

}
