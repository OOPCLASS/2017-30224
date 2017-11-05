package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon() {
		super.setNrOfLegs(4);
		super.setName("Cami");
	}
	
	public Chameleon(boolean laysEggs) {
		super(laysEggs);
	}
}
