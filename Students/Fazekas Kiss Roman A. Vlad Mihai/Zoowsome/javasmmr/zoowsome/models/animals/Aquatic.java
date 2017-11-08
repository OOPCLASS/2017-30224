package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	private Integer avgSwimDepth;
	private Enum waterType;

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Enum getWaterType() {
		return waterType;
	}

	public void setWaterType(Enum waterType) {
		this.waterType = waterType;
	}

}
