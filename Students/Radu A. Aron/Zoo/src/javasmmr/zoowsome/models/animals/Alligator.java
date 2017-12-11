package javasmmr.zoowsome.models.animals;

public class Alligator extends Reptile
{
	public Alligator()
	{
		this.setNrOfLegs(4);
		this.setName("Alligator");
		this.setLaysEggs(true);
	}
	
	public Alligator(int nrOfLegs, String name, boolean laysEggs)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
}
