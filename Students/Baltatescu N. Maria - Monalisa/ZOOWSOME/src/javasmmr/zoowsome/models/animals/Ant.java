package javasmmr.zoowsome.models.animals;
public class Ant extends Insect {
	
	public Ant(boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(canFly, isDangerous, maintenanceCost, dangerPerc);
		super.setName("Ani");
		super.setNrOfLegs(6);
	}
}
