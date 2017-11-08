package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger() {
		setNrOfLegs(4);
		setName("Unknown");
		setNormalBodyTemp(36);
		setPercBodyHair(80);
	}

	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
