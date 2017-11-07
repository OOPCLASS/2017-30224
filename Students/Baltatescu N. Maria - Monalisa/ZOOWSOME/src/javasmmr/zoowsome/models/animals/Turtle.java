package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	public Turtle() {
		super.setNrOfLegs(4);
		super.setName("Toto");
	}
	
	public Turtle(boolean laysEggs) {
		super(laysEggs);
	}
}
