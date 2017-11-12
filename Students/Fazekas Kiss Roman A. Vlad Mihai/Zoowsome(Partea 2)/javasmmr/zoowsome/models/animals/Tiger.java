package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}

	public Tiger(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(4);
		super.setName("Implicit_Tiger_Name");
		super.setNormalBodyTemp(37.5f);
		super.setPercBodyHair(98f);
	}
}
