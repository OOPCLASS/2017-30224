package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle(boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(laysEggs, maintenanceCost, dangerPerc);
		super.setName("Toto");
		super.setNrOfLegs(4);
	}
}
