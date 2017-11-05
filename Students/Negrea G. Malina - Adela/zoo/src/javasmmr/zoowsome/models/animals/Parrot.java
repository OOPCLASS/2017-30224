package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {

	public Parrot() {
		setNrOfLegs(2);
		setName("Happy Parrot");
		super.migrates = false;
		super.avgFlightAltitude = 7;
	}

	public Parrot(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		setNrOfLegs(nrOfLegs);
		setName(name);
		super.migrates = migrates;
		super.avgFlightAltitude = avgFlightAltitude;
	}

	public String getAnimalType() {
		return "Parrot";
	}
}
