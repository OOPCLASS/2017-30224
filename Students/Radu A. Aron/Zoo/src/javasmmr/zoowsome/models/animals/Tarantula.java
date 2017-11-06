package javasmmr.zoowsome.models.animals;

public class Tarantula extends Insect
{
	public Tarantula()
	{
		this.setNrOfLegs(8);
		this.setName("Tarantula");
		this.setCanFly(false);
		this.setIsDangerous(true);
	}
	
	public Tarantula(int nrOfLegs, String name, boolean canFly, boolean isDangerous)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
	}
}
