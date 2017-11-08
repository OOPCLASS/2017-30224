package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {
	
	public Stork() {
		setNrOfLegs(2);
		setName("Unknown");
		setMigrates(true);
		setAvgFlightAltitude(80);
	}

	public Stork(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
