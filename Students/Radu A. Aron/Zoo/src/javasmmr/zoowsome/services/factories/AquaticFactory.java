package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory
{
	@Override 
	public Animal getAnimal(String type) throws Exception
	{ 
		if (Constants.Animals.Aquatics.Shark.equals(type)) 
		{ 
			return new Shark(); 
		}
		else if (Constants.Animals.Aquatics.Piranha.equals(type)) 
		{ 
			return new Piranha(); 
		} 
		else if (Constants.Animals.Aquatics.Stingray.equals(type))
		{
			return new Stingray();
		}
		else 
		{ 
			throw new Exception("Invalid animal exception!"); 
		} 		
	}
}
