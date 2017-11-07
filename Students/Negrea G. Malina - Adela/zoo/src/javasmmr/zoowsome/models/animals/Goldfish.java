package javasmmr.zoowsome.models.animals;

public class Goldfish extends Aquatic {

	public Goldfish() {
		setNrOfLegs(3);
		setName("Happy Goldfish ");
		super.avgSwimDepth = 1;
		super.waterType = Enum.FRESH;

	}

	public Goldfish(Integer nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.avgSwimDepth = avgSwimDepth;
		super.waterType = waterType;

	}

	public String getAnimalType() {
		return "Goldfish";
	}

}
