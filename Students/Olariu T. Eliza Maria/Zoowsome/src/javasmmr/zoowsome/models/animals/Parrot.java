package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird{

	public Parrot() {
		setNrOfLegs(2);
		setName("Unknown");
		setMigrates(false);
		setAvgFlightAltitude(40);
	}

	public Parrot(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
}
