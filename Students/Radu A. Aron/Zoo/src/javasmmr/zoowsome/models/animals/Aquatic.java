package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal
{
	private int avgSwimDepth;
	private WaterType waterType;
	
	public void setAvgSwimDepth(int avgSwimDepth)
	{
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAvgSwimDepth()
	{
		return this.avgSwimDepth;
	}
	
	public void setWaterType(WaterType waterType)
	{
		this.waterType = waterType;
	}
	
	public WaterType getWaterType()
	{
		return this.waterType;
	}
}
