package javasmmr.zoowsome.models.animals;

public class Octopus extends Aquatic {

	public Octopus(Integer nrOfLegs, String Name, Integer avgSwimDepth, WaterType waterType, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}

	public Octopus(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(8);
		this.setName("Octopus");
		this.setAvgSwimDepth(100);
		this.setWaterType(WaterType.FRESHWATER);

	}
}
