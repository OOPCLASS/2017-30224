package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs,name,canFly,isDangerous, maintenanceCost, dangerPerc);
	}

	public Spider(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(8);
		super.setName("Implicit_Spider_Name");
		super.setCanFly(false);
		super.setIsDangerous(true);
	}
}
