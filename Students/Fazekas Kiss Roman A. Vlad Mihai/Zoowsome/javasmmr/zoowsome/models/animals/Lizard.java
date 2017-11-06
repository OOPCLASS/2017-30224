package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(int nrOfLegs, String name, Boolean laysEggs) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setLaysEggs(laysEggs);
	}

	public Lizard() {
		super.setNrOfLegs(4);
		super.setName("Implicit_Lizard_Name");
		super.setLaysEggs(true);
	}
}
