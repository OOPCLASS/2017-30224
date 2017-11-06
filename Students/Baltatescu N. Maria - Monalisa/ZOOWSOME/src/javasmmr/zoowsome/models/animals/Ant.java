package javasmmr.zoowsome.models.animals;

public class Ant extends Insect {
	public Ant() {
		super.setNrOfLegs(6);
		super.setName("Ani");
	}
	
	public Ant(boolean canFly, boolean isDangerous) {
		super(canFly, isDangerous);
	}
}
