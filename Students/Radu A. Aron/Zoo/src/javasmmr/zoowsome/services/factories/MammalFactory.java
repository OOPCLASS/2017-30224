package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory 
{ 
	@Override 
	public Animal getAnimal(String type) throws Exception
	{ 
		if (Constants.Animals.Mammals.Koala.equals(type)) 
		{ 
			return new Koala(); 
		}
		else if (Constants.Animals.Mammals.Zebra.equals(type)) 
		{ 
			return new Zebra(); 
		} 
		else if (Constants.Animals.Mammals.Gorilla.equals(type))
		{
			return new Gorilla();
		}
		else 
		{ 
			throw new Exception("Invalid animal exception!"); 
		} 		
	}
}
