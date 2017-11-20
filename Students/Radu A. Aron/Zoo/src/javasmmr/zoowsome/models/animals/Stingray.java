package javasmmr.zoowsome.models.animals;

public class Stingray extends Aquatic
{
	public Stingray()
	{
		this.setNrOfLegs(0);
		this.setName("Stingray");
		this.setAvgSwimDepth(3200);
		this.setWaterType(WaterType.SALTEDWATER);
	}
	
	public Stingray(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
}
