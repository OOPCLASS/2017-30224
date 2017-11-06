package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory
{
	@Override 
	public Animal getAnimal(String type) throws Exception
	{ 
		if (Constants.Animals.Reptiles.Anaconda.equals(type)) 
		{ 
			return new Anaconda(); 
		}
		else if (Constants.Animals.Reptiles.Alligator.equals(type)) 
		{ 
			return new Alligator(); 
		} 
		else if (Constants.Animals.Reptiles.Lizzard.equals(type))
		{
			return new Lizzard();
		}
		else 
		{ 
			throw new Exception("Invalid animal exception!"); 
		} 		
	}
}
