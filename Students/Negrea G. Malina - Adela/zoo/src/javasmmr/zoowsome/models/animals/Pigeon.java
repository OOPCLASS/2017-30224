package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird {

	public Pigeon() {
		setNrOfLegs(2);
		setName("Happy Pigeon");
		super.migrates = false;
		super.avgFlightAltitude = 5;
	}

	public Pigeon(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.migrates = migrates;
		super.avgFlightAltitude = avgFlightAltitude;
	}

	public String getAnimalType() {
		return "Pigeon";
	}

}
