package javasmmr.zoowsome.models.animals;

public class Dolphin extends Mammal {
	public Dolphin(float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Didi");
		super.setNrOfLegs(0);
	}
	
}
