package javasmmr.zoowsome.models.animals;

public class Baboon extends Mammal {

	public Baboon() {
		setNrOfLegs(2);
		setName("Happy Baboon");
		normalBodyTemperature = (float) 38.0;
		pereBodyHair = (float) 90.5;

	}

	public Baboon(Integer nrOfLegs, String name, float normalBodyTemperature, float pereBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.normalBodyTemperature = normalBodyTemperature;
		super.pereBodyHair = pereBodyHair;
	}

	public String getAnimalType() {
		return "Baboon";
	}

}
