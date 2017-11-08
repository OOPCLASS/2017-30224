package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

	public Cockroach(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
	}

	public Cockroach() {
		super.setNrOfLegs(6);
		super.setName("Implicit_Cockroach_Name");
		super.setCanFly(false);
		super.setIsDangerous(false);
	}
}
