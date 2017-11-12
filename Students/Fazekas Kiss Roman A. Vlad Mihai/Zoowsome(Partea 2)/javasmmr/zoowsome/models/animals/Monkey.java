package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {

	public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}

	public Monkey(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(2);
		super.setName("Implicit_Monkey_Name");
		super.setNormalBodyTemp(37f);
		super.setPercBodyHair(90f);
	}
}
