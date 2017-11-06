package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider() {
		super.setNrOfLegs(8);
		super.setName("Soso");
	}
	
	public Spider(boolean canFly, boolean isDangerous, String name, int nrOfLegs) {
		super(canFly, isDangerous);
	}
}
