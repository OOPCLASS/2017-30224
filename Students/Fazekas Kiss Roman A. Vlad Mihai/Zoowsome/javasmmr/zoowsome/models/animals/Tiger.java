package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}

	public Tiger() {
		super.setNrOfLegs(4);
		super.setName("Implicit_Tiger_Name");
		super.setNormalBodyTemp(37.5f);
		super.setPercBodyHair(98f);
	}
}
