package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile
{
	public Lizzard()
	{
		this.setNrOfLegs(0);
		this.setName("Lizzard");
		this.setLaysEggs(true);
	}
	
	public Lizzard(int nrOfLegs, String name, boolean laysEggs)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
}
