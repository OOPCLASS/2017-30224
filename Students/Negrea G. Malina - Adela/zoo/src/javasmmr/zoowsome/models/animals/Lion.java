package javasmmr.zoowsome.models.animals;

public class Lion extends Mammal {

	public Lion() {
		setNrOfLegs(2);
		setName("Happy Lion");
		normalBodyTemperature = (float) 37.0;
		pereBodyHair = (float) 96.7;

	}

	public Lion(Integer nrOfLegs, String name, float normalBodyTemperature, float pereBodyHair) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.normalBodyTemperature = normalBodyTemperature;
		super.pereBodyHair = pereBodyHair;
	}

	public String getAnimalType() {
		return "Lion";
	}

}
