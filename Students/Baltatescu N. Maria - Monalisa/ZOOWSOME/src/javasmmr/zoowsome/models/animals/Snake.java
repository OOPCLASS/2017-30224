package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(laysEggs, maintenanceCost, dangerPerc);
		super.setName("Sisi");
		super.setNrOfLegs(0);
	}
}
