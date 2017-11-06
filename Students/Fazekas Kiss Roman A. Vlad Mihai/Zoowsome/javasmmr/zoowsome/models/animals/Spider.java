package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
	}

	public Spider() {
		super.setNrOfLegs(8);
		super.setName("Implicit_Spider_Name");
		super.setCanFly(false);
		super.setIsDangerous(true);
	}
}
