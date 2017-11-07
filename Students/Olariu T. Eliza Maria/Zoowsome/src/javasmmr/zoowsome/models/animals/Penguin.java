package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird{

	public Penguin() {
		setNrOfLegs(2);
		setName("Unknown");
		setMigrates(false);
		setAvgFlightAltitude(1);
	}

	public Penguin(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
