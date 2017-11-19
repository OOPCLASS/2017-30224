package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	
	public Shark(int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(avgSwimDepth, waterType, maintenanceCost, dangerPerc);
		super.setName("Riki");
		super.setNrOfLegs(0);
	}
}
