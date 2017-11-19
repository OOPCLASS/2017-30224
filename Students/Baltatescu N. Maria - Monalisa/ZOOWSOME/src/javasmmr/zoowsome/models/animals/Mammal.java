package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
}
