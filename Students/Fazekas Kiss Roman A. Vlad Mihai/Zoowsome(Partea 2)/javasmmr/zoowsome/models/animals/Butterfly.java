package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}

	public Butterfly(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(0);
		super.setName("Implicit_Butterfly_Name");
		super.setCanFly(true);
		super.setIsDangerous(false);
	}
}
