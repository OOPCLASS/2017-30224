package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {
	
	public Bee(boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(canFly, isDangerous, maintenanceCost, dangerPerc);
		super.setName("Bibi");
		super.setNrOfLegs(6);
	}
}
