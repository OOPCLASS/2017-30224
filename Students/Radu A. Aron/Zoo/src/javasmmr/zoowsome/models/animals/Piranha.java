package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic
{
	public Piranha()
	{
		this.setNrOfLegs(0);
		this.setName("Piranha");
		this.setAvgSwimDepth(125);
		this.setWaterType(WaterType.SALTEDWATER);
	}
	
	public Piranha(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
