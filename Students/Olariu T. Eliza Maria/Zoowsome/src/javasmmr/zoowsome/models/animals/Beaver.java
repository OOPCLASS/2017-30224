package javasmmr.zoowsome.models.animals;

public class Beaver extends Aquatic{

	public Beaver() {
		setNrOfLegs(4);
		setName("Unknown");
		setAvgSwimDepth(5);
		setWaterType(WaterType.river);
	}

	public Beaver(int nrOfLegs, String name, int avgSwimDepth, WaterType water){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(water);
	}
}
