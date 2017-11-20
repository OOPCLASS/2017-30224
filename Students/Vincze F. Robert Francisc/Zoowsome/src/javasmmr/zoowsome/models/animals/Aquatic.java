package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals {

	private Integer avgSwimDepth;
	private WaterType waterType;

	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public WaterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public void makesSound() {
		System.out.println("Gluglugluglu");
	}
}
