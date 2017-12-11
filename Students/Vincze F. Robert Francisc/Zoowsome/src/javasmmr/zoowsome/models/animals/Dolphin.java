package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin(Integer nrOfLegs, String Name, Integer avgSwimDepth, WaterType waterType, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}

	public Dolphin(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(0);
		this.setName("Dolphin");
		this.setAvgSwimDepth(50);
		this.setWaterType(WaterType.SALTEDWATER);

	}
}
