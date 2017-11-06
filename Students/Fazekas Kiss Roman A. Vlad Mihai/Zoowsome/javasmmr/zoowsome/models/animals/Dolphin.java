package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {

	public Dolphin(int nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
	}

	public Dolphin() {
		super.setNrOfLegs(0);
		super.setName("Implicit_Dolphin_Name");
		super.setAvgSwimDepth(500);
		super.setWaterType(Enum.SALTWATER);
	}
}
