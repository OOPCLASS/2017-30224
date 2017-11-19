package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {
	
	public Octopus(int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(avgSwimDepth, waterType, maintenanceCost, dangerPerc);
		super.setName("Oti");
		super.setNrOfLegs(0);
	}
}
