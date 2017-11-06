package javasmmr.zoowsome.models.animals;

public class Owl extends Bird
{
	public Owl()
	{
		this.setNrOfLegs(2);
		this.setName("Owl");
		this.setAvgFlightAltitude(102);
		this.setMigrates(true);
	}
	
	public Owl(int nrOfLegs, String name, int avgFlightAltitude, boolean migrates)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
}
