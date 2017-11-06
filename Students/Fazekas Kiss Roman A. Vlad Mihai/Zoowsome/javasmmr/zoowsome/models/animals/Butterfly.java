package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
	}

	public Butterfly() {
		super.setNrOfLegs(0);
		super.setName("Implicit_Butterfly_Name");
		super.setCanFly(true);
		super.setIsDangerous(false);
	}
}
