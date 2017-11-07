package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{

	public Lizard() {
		setNrOfLegs(4);
		setName("Unknown");
		setLaysEggs(true);
	}

	public Lizard(int nrOfLegs, String name, boolean laysEggs){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
}
