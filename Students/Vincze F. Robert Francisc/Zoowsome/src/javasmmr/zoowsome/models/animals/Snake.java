package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(Integer nrOfLegs, String Name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setLaysEggs(laysEggs);

	}

	public Snake(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(0);
		this.setName("Snake");
		this.setLaysEggs(true);

	}
}
