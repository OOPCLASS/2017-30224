package javasmmr.zoowsome.models.animals;

public class Catfish extends Aquatic {

	public Catfish() {
		setNrOfLegs(3);
		setName("Happy Catfish");
		super.avgSwimDepth = 2;
		super.waterType = Enum.FRESH;

	}

	public Catfish(Integer nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.avgSwimDepth = avgSwimDepth;
		super.waterType = waterType;

	}

	public String getAnimalType() {
		return "Catfish";
	}

}
