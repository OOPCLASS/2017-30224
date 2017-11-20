package javasmmr.zoowsome.models.animals;

public class Elephant extends Mammal {

	public Elephant(Integer nrOfLegs, String Name, float normalBodyTemp, float percBodyHair, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);

	}

	public Elephant(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Elephant");
		this.setNormalBodyTemp((float) 35.9);
		this.setPercBodyHair(10);

	}

}
