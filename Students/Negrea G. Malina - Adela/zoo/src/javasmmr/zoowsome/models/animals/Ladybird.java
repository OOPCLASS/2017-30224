package javasmmr.zoowsome.models.animals;

public class Ladybird extends Insect {

	public Ladybird() {
		setNrOfLegs(6);
		setName("Happy Ladybird");
		super.canFly = true;
		super.isDangerous = false;

	}

	public Ladybird(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.canFly = canFly;
		super.isDangerous = isDangerous;

	}

	public String getAnimalType() {
		return "Ladybird";
	}

}
