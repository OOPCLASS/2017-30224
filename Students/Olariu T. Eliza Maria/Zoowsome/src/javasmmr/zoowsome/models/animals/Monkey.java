package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	public Monkey() {
		setNrOfLegs(4);
		setName("Unknown");
		setNormalBodyTemp(36);
		setPercBodyHair(70);
	}

	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
