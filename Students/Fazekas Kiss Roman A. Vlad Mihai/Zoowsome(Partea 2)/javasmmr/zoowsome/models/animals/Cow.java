package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}

	public Cow(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(4);
		super.setName("Implicit_Cow_Name");
		super.setNormalBodyTemp(38.6f);
		super.setPercBodyHair(95f);
	}
}
