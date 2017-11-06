package javasmmr.zoowsome.models.animals;

public class CatFish extends Aquatic {
	public CatFish() {
		super.setNrOfLegs(0);
		super.setName("Nemo");
	}
	
	public CatFish(int avgSwimDepth, WaterType waterType) {
		super(avgSwimDepth, waterType);
	}
}
