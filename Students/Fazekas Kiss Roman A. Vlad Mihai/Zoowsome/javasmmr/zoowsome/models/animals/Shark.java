package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(int nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
	}

	public Shark() {
		super.setNrOfLegs(0);
		super.setName("Implicit_Shark_Name");
		super.setAvgSwimDepth(2000);
		super.setWaterType(Enum.SALTWATER);
	}
}
