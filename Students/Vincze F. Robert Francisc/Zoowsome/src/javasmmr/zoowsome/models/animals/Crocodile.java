package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	public Crocodile(Integer nrOfLegs, String Name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setLaysEggs(laysEggs);

	}

	public Crocodile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Crocodile");
		this.setLaysEggs(true);

	}
}
