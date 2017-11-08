package javasmmr.zoowsome.models.animals;

public class Hippopotamus extends Aquatic{

	public Hippopotamus() {
		setNrOfLegs(4);
		setName("Unknown");
		setAvgSwimDepth(5);
		setWaterType(WaterType.river);
	}

	public Hippopotamus(int nrOfLegs, String name, int avgSwimDepth, WaterType water){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(water);
	}
}
