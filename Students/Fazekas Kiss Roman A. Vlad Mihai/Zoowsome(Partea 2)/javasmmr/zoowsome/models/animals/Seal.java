package javasmmr.zoowsome.models.animals;

public class Seal extends Aquatic{

	public Seal(int nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, waterType, maintenanceCost, dangerPerc); 
	}

	public Seal(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(0);
		super.setName("Implicit_Seal_Name");
		super.setAvgSwimDepth(50);
		super.setWaterType(WaterType.SALTWATER);
	}
}
