package javasmmr.zoowsome.models.animals;

public class Gorilla extends Mammal
{
	public Gorilla()
	{
		this.setNrOfLegs(4);
		this.setName("Gorilla");
		this.setNormalBodyTemp((float)35.5);
		this.setPercBodyHair((float)84.6);
	}
	
	public Gorilla(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
}
