package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;
	
	public Aquatic(int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}
}
