package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {

	public Stork() {
		setNrOfLegs(2);
		setName("Happy Stork");
		super.migrates = true;
		super.avgFlightAltitude = 10;
	}

	public Stork(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.migrates = migrates;
		super.avgFlightAltitude = avgFlightAltitude;
	}

	public String getAnimalType() {
		return "Stork";
	}

}
