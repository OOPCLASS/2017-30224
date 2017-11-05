package javasmmr.zoowsome.models.animals;

public class Millipede extends Insect {

	public Millipede() {
		setNrOfLegs(600);
		setName("Happy Millipede");
		super.canFly = true;
		super.isDangerous = false;

	}

	public Millipede(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.canFly = canFly;
		super.isDangerous = isDangerous;

	}

	public String getAnimalType() {
		return "Millipede";
	}

}
