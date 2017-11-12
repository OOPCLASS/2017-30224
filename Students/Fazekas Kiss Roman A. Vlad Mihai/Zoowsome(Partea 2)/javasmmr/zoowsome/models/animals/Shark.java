package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(int nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, waterType, maintenanceCost, dangerPerc);
	}

	public Shark(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(0);
		super.setName("Implicit_Shark_Name");
		super.setAvgSwimDepth(2000);
		super.setWaterType(WaterType.SALTWATER);
	}
}
