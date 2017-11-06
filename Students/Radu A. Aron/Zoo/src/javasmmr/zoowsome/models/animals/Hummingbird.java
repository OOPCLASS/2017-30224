package javasmmr.zoowsome.models.animals;

public class Hummingbird extends Bird
{
	public Hummingbird()
	{
		this.setNrOfLegs(2);
		this.setName("Hummingbird");
		this.setAvgFlightAltitude(15);
		this.setMigrates(false);
	}
	
	public Hummingbird(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
