package javasmmr.zoowsome.models.animals;

public class Anaconda extends Reptile
{
	public Anaconda()
	{
		this.setNrOfLegs(0);
		this.setName("Anaconda");
		this.setLaysEggs(true);
	}
	
	public Anaconda(int nrOfLegs, String name, boolean laysEggs)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
}
