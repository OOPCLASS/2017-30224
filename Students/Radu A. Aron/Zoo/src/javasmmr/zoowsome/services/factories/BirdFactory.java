package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory
{
	@Override 
	public Animal getAnimal(String type) throws Exception
	{ 
		if (Constants.Animals.Birds.Owl.equals(type)) 
		{ 
			return new Owl(); 
		}
		else if (Constants.Animals.Birds.Toucan.equals(type)) 
		{ 
			return new Toucan(); 
		} 
		else if (Constants.Animals.Birds.Hummingbird.equals(type))
		{
			return new Hummingbird();
		}
		else 
		{ 
			throw new Exception("Invalid animal exception!"); 
		} 		
	}
}
