package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider(boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(canFly, isDangerous, maintenanceCost, dangerPerc);
		super.setName("Soso");
		super.setNrOfLegs(6);
	}
}
