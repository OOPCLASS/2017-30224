package javasmmr.zoowsome.models.animals;

public class Frog extends Reptile {

	public Frog(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Frog(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(4);
		super.setName("Implicit_Frog_Name");
		super.setLaysEggs(true);
	}
}
