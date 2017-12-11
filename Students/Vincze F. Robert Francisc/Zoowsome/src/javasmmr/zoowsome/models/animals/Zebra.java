package javasmmr.zoowsome.models.animals;

public class Zebra extends Mammal {

	public Zebra(Integer nrOfLegs, String Name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);

	}

	public Zebra(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Zebra");
		this.setNormalBodyTemp((float) 38.4);
		this.setPercBodyHair((float) 22.55);

	}
}
