package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	private WaterType waterType;
	
	public Aquatic() {
	}
	
	public Aquatic(int avgSwimDepth, WaterType waterType) {
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}
}
