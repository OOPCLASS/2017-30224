package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake() {
		super.setNrOfLegs(0);
		super.setName("Sisi");
	}
	
	public Snake(boolean laysEggs) {
		super(laysEggs);
	}
}
