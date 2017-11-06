package javasmmr.zoowsome.models.animals;

public class Caterpillar extends Insect
{
	public Caterpillar()
	{
		this.setNrOfLegs(16);
		this.setName("Tarantula");
		this.setCanFly(false);
		this.setIsDangerous(false);
	}
	
	public Caterpillar(int nrOfLegs, String name, boolean canFly, boolean isDangerous)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
	}
}
