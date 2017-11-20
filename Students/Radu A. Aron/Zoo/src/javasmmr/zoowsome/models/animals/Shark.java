package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic
{
	public Shark()
	{
		this.setNrOfLegs(0);
		this.setName("Shark");
		this.setAvgSwimDepth(1500);
		this.setWaterType(WaterType.SALTEDWATER);
	}
	
	public Shark(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
