package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}

	public Cow() {
		super.setNrOfLegs(4);
		super.setName("Implicit_Cow_Name");
		super.setNormalBodyTemp(38.6f);
		super.setPercBodyHair(95f);
	}
}
