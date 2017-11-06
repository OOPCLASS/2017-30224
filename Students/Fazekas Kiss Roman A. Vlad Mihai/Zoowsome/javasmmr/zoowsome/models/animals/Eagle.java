package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setMigrates(migrates);
		super.setAvgFlightAltitude(avgFlightAltitude);
	}

	public Eagle() {
		super.setNrOfLegs(2);
		super.setName("Implicit_Eagle_Name");
		super.setMigrates(true);
		super.setAvgFlightAltitude(11000);
	}
}
