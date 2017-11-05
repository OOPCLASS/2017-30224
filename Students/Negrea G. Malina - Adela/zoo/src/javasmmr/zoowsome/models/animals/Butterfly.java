package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		setNrOfLegs(6);
		setName("Happy Butterfly");
		super.canFly = true;
		super.isDangerous = false;

	}

	public Butterfly(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.canFly = canFly;
		super.isDangerous = isDangerous;

	}

	public String getAnimalType() {
		return "Butterfly";
	}

}
