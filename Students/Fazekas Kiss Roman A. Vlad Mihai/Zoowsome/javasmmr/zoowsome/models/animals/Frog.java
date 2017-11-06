package javasmmr.zoowsome.models.animals;

public class Frog extends Reptile {

	public Frog(int nrOfLegs, String name, Boolean laysEggs) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setLaysEggs(laysEggs);
	}

	public Frog() {
		super.setNrOfLegs(4);
		super.setName("Implicit_Frog_Name");
		super.setLaysEggs(true);
	}
}
