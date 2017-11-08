package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setNormalBodyTemp(normalBodyTemp);
		super.setPercBodyHair(percBodyHair);
	}

	public Monkey() {
		super.setNrOfLegs(2);
		super.setName("Implicit_Monkey_Name");
		super.setNormalBodyTemp(37f);
		super.setPercBodyHair(90f);
	}
}
