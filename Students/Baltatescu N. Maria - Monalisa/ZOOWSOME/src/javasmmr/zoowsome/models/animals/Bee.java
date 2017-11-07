package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {
	public Bee() {
		super.setNrOfLegs(6);
		super.setName("Bibi");
	}
	
	public Bee(boolean canFly, boolean isDangerous) {
		super(canFly, isDangerous);
	}
}
