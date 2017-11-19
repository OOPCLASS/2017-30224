package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Timi");
		super.setNrOfLegs(4);
	}
	
	
}
