package javasmmr.zoowsome.models.animals;

public abstract class Animal 
{
	private int nrOfLegs;
	private String name;
	
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs = nrOfLegs;
	}
	
	public int getNrOfLegs()
	{
		return this.nrOfLegs;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
