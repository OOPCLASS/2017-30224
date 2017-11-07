package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark() {
		super.setNrOfLegs(0);
		super.setName("Riki");
	}
	
	public Shark(int avgSwimDepth, WaterType waterType) {
		super(avgSwimDepth, waterType);
	}
}
