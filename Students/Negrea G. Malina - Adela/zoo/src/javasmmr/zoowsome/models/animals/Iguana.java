package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile {

	public Iguana() {
		setNrOfLegs(4);
		setName("Happy Iguana");
		super.laysEggs = true;

	}

	public Iguana(Integer nrOfLegs, String name, Boolean laysEggs) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.laysEggs = laysEggs;

	}

	public String getAnimalType() {
		return "Iguana";
	}

}
