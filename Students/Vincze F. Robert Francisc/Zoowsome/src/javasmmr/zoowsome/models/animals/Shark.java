package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String Name, Integer avgSwimDepth, WaterType waterType, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);

	}

	public Shark(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(0);
		this.setName("Shark");
		this.setAvgSwimDepth(100);
		this.setWaterType(WaterType.SALTEDWATER);

	}
}
