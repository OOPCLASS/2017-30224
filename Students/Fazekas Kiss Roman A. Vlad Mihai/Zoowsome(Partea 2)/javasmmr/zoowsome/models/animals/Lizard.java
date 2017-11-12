package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Lizard(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(4);
		super.setName("Implicit_Lizard_Name");
		super.setLaysEggs(true);
	}
}
