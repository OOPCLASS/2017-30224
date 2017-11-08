package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animals.Reptiles.Lizard.equals(type)) {
			return new Lizard();
		} else if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile();
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake();
		} else {
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}
}
