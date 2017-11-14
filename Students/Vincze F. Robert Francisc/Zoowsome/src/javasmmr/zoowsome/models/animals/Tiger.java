package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {

	public Tiger(Integer nrOfLegs, String Name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);

	}

	public Tiger(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Tiger");
		this.setNormalBodyTemp((float) 37.5);
		this.setPercBodyHair((float) 37.8);

	}
}
