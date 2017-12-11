package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory 
{

	public Animals getAnimal(String type) throws Exception{
		if (Constants.Animals.Aquatic.Shark.equals(type)) {
			return new Shark(0,"Shark",100,WaterType.SALTEDWATER,7.2,0.9);
		} else if (Constants.Animals.Aquatic.Dolphin.equals(type)) {
			return new Dolphin(0,"Dolphin",50,WaterType.SALTEDWATER,6.65,1.6);
		} else if (Constants.Animals.Aquatic.Octopus.equals(type)) {
			return new Octopus(8,"Octopus",100,WaterType.FRESHWATER,6.65,6.5);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}