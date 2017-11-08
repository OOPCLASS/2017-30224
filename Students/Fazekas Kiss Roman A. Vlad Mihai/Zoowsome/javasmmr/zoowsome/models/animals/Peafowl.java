package javasmmr.zoowsome.models.animals;

public class Peafowl extends Bird {

	public Peafowl(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude) {
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		super.setMigrates(migrates);
		super.setAvgFlightAltitude(avgFlightAltitude);
	}

	public Peafowl() {
		super.setNrOfLegs(2);
		super.setName("Implicit_Peafowl_Name");
		super.setMigrates(false);
		super.setAvgFlightAltitude(0);
	}
}
