package javasmmr.zoowsome.models.animals;

public class Dolphin extends Mammal {
	public Dolphin() {
		super.setNrOfLegs(0);
		super.setName("Didi");
	}

	public Dolphin(float normalBodyTemp, float percBodyHair) {
		super(normalBodyTemp, percBodyHair);
	}
}
