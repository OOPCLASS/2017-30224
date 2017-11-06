package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory
{
	@Override 
	public Animal getAnimal(String type) throws Exception
	{ 
		if (Constants.Animals.Insects.Tarantula.equals(type)) 
		{ 
			return new Tarantula(); 
		}
		else if (Constants.Animals.Insects.Mosquito.equals(type)) 
		{ 
			return new Mosquito(); 
		} 
		else if (Constants.Animals.Insects.Caterpillar.equals(type))
		{
			return new Caterpillar();
		}
		else 
		{ 
			throw new Exception("Invalid animal exception!"); 
		} 		
	}
}
