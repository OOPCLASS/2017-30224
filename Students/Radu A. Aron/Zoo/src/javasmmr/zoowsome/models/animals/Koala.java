package javasmmr.zoowsome.models.animals;

public class Koala extends Mammal
{
	public Koala()
	{
		this.setNrOfLegs(4);
		this.setName("Koala");
		this.setNormalBodyTemp((float)36.6);
		this.setPercBodyHair((float)95.2);
	}
	
	public Koala(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
}
