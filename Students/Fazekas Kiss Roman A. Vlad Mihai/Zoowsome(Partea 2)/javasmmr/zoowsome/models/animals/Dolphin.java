package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin(int nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, waterType, maintenanceCost, dangerPerc); 
	}

	public Dolphin(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(0);
		super.setName("Implicit_Dolphin_Name");
		super.setAvgSwimDepth(500);
		super.setWaterType(WaterType.SALTWATER);
	}
}
