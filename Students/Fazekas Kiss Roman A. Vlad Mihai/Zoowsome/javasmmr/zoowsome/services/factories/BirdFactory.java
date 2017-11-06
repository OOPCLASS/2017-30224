package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Peafowl.equals(type)) {
			return new Peafowl();
		} else if (Constants.Animals.Birds.Eagle.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.Stork.equals(type)) {
			return new Stork();
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
