package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Bird.Raven.equals(type)) {
			return new Raven(2, "Raven", false, 60, 4.67, 2.25);
		} else if (Constants.Animals.Bird.Owl.equals(type)) {
			return new Owl(2, "Owl", false, 35, 2.7, 0.5);
		} else if (Constants.Animals.Bird.Pelican.equals(type)) {
			return new Pelican(2, "Pelican", true, 65, 5.5, 1.5);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}