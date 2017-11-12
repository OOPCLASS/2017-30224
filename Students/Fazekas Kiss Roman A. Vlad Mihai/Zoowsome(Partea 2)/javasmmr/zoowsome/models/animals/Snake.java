package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Snake(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(0);
		super.setName("Implicit_Snake_Name");
		super.setLaysEggs(true);
	}
}
