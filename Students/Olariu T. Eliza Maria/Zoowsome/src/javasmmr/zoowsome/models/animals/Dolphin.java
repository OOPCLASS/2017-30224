package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin() {
		setNrOfLegs(4);
		setName("Unknown");
		setAvgSwimDepth(30);
		setWaterType(WaterType.sea);
	}

	public Dolphin(int nrOfLegs, String name, int avgSwimDepth, WaterType water) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(water);
	}
}
