package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	
	public Chameleon(boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(laysEggs, maintenanceCost, dangerPerc);
		super.setName("Cami");
		super.setNrOfLegs(4);
	}
}
