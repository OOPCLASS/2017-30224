package javasmmr.zoowsome.models.animals;

public class Mosquito extends Insect
{
	public Mosquito()
	{
		this.setNrOfLegs(6);
		this.setName("Mosquito");
		this.setCanFly(true);
		this.setIsDangerous(false);
	}
	
	public Mosquito(int nrOfLegs, String name, boolean canFly, boolean isDangerous)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
	}
}
