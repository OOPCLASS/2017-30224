package javasmmr.zoowsome.models.animals;

public class Snail extends Reptile {

	public Snail() {
		setNrOfLegs(4);
		setName("Happy Snail");
		super.laysEggs = true;

	}

	public Snail(Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.laysEggs = laysEggs;

	}

	public String getAnimalType() {
		return "Snail";
	}

}
