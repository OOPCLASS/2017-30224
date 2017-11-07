package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal() {
	}

	public Mammal(float normalBodyTemp, float percBodyHair) {
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
}
