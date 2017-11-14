package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Insect.Scorpion.equals(type)) {
			return new Scorpion(4, "Scorpion", false, true, 6.8, 8.5);
		} else if (Constants.Animals.Insect.Butterfly.equals(type)) {
			return new Butterfly(4, "Butterfly", true, false, 1.5, 0.5);
		} else if (Constants.Animals.Insect.Spider.equals(type)) {
			return new Spider(8, "Spider", false, true, 1.4, 3.5);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}