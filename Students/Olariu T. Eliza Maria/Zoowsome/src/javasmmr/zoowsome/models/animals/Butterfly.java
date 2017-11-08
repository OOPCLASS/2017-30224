package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

	public Butterfly() {
		setNrOfLegs(4);
		setName("Unknown");
		setCanFly(true);
		setIsDangerous(false);
	}

	public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
}
