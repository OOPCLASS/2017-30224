package javasmmr.zoowsome.models.animals;

public class Toucan extends Bird
{
	public Toucan()
	{
		this.setNrOfLegs(2);
		this.setName("Toucan");
		this.setAvgFlightAltitude(52);
		this.setMigrates(false);
	}
	
	public Toucan(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
