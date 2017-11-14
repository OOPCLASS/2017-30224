package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory 
{

	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Reptile.Crocodile.equals(type)) {
			return new Crocodile(4,"Crocodile",true,6.2,0.9);
		} else if (Constants.Animals.Reptile.Snake.equals(type)) {
			return new Snake(0,"Snake",true,4,7.75);
		} else if (Constants.Animals.Reptile.Lizard.equals(type)) {
			return new Lizard(4,"Lizard",true,3.5,2.2 );
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}