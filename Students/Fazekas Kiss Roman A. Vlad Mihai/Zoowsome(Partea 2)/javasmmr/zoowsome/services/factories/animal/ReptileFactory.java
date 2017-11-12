package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Reptiles;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Reptiles.LIZARD.equals(type)) {
			return new Lizard(1.2, 0.13);
		} else if (Constants.Animals.Reptiles.FROG.equals(type)) {
			return new Frog(0.9, 0.05);
		} else if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
			return new Snake(2.7, 0.40);
		} else {
			try {
				throw new Exception("Invalid animal exception!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}
