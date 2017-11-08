package javasmmr.zoowsome.models.animals;

public class Seal extends Aquatic{

	public Seal(int nrOfLegs, String name, Integer avgSwimDepth, Enum waterType) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setAvgSwimDepth(avgSwimDepth);
		super.setWaterType(waterType);
	}

	public Seal() {
		super.setNrOfLegs(0);
		super.setName("Implicit_Seal_Name");
		super.setAvgSwimDepth(50);
		super.setWaterType(Enum.SALTWATER);
	}
}
