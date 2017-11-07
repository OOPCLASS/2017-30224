package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{

	public Cow() {
		setNrOfLegs(4);
		setName("Unknown");
		setNormalBodyTemp(36);
		setPercBodyHair(5);
	}

	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
