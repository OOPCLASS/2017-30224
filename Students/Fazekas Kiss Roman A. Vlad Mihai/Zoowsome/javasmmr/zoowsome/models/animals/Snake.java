package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(int nrOfLegs, String name, Boolean laysEggs) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setLaysEggs(laysEggs);
	}

	public Snake() {
		super.setNrOfLegs(0);
		super.setName("Implicit_Snake_Name");
		super.setLaysEggs(true);
	}
}
