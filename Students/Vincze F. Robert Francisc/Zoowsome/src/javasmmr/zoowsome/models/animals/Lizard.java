package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String Name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setLaysEggs(laysEggs);

	}

	public Lizard(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Lizard");
		this.setLaysEggs(true);

	}
}
