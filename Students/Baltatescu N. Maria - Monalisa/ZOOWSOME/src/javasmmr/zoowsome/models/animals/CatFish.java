package javasmmr.zoowsome.models.animals;

public class CatFish extends Aquatic {
	
	public CatFish(int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(avgSwimDepth, waterType, maintenanceCost, dangerPerc);
		super.setName("Pisi");
		super.setNrOfLegs(0);
	}
}
