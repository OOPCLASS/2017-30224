package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger() {
		super.setNrOfLegs(4);
		super.setName("Timi");
	}

	public Tiger(float normalBodyTemp, float percBodyHair) {
		super(normalBodyTemp, percBodyHair);
	}
}
