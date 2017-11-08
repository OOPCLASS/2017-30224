package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animals.Birds.Penguin.equals(type)) {
			return new Penguin();
		} else if (Constants.Animals.Birds.Stork.equals(type)) {
			return new Stork();
		} else {
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}
}
