package javasmmr.zoowsome.models.animals;

public class Zebra extends Mammal
{
	public Zebra()
	{
		this.setNrOfLegs(4);
		this.setName("Zebra");
		this.setNormalBodyTemp((float)38.1);
		this.setPercBodyHair((float)90.6);
	}
	
	public Zebra(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair)
	{
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}
}
