package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach() {
		setNrOfLegs(6);
		setName("Unknown");
		setCanFly(true);
		setIsDangerous(false);
	}

	public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

}
