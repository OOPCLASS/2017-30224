package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {

	public Stork(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setMigrates(migrates);
		super.setAvgFlightAltitude(avgFlightAltitude);
	}

	public Stork() {
		super.setNrOfLegs(2);
		super.setName("Implicit_Stork_Name");
		super.setMigrates(true);
		super.setAvgFlightAltitude(4800);
	}
}
