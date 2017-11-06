package javasmmr.zoowsome.models.animals;

public class Deer extends Mammal {

	public Deer() {
		setNrOfLegs(2);
		setName("Happy Deer");
		normalBodyTemperature = (float) 37.5;
		pereBodyHair = (float) 98.3;

	}

	public Deer(Integer nrOfLegs, String name, float normalBodyTemperature, float pereBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.normalBodyTemperature = normalBodyTemperature;
		super.pereBodyHair = pereBodyHair;
	}

	public String getAnimalType() {
		return "Deer";
	}
}
