package javasmmr.zoowsome.models.animals;

public class Dog extends Mammal {
	public Dog() {
		super.setNrOfLegs(4);
		super.setName("Zack");
	}

	public Dog(float normalBodyTemp, float percBodyHair) {
		super(normalBodyTemp, percBodyHair);
	}
}
