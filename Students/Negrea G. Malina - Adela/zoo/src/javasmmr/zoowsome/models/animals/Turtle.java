package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {

	public Turtle() {
		setNrOfLegs(4);
		setName("Happy Turtle");
		super.laysEggs = true;

	}

	public Turtle(Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.laysEggs = laysEggs;

	}

	public String getAnimalType() {
		return "Turtle";
	}

}
