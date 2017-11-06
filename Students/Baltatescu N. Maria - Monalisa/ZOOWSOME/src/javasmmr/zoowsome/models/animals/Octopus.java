package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
	public Octopus() {
		super.setNrOfLegs(0);
		super.setName("Oti");
	}
	
	public Octopus(int avgSwimDepth, WaterType waterType) {
		super(avgSwimDepth, waterType);
	}
}
