package javasmmr.zoowsome.models.animals;

public class Dog extends Mammal {
	public Dog(float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Zack");
		super.setNrOfLegs(4);
	}
	
}
