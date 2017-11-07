package javasmmr.zoowsome.models.animals;

public class Carp extends Aquatic {

	public Carp() {
		setNrOfLegs(3);
		setName("Happy Carp");
		super.avgSwimDepth = 2;
		super.waterType = Enum.SALTY;

	}

	public Carp(Integer nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.avgSwimDepth = avgSwimDepth;
		super.waterType = waterType;

	}

	public String getAnimalType() {
		return "Carp";
	}

}
