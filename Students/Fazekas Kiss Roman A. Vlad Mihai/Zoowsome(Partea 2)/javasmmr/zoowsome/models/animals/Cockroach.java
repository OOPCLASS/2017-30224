package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {

	public Cockroach(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}

	public Cockroach(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(6);
		super.setName("Implicit_Cockroach_Name");
		super.setCanFly(false);
		super.setIsDangerous(false);
	}
}
