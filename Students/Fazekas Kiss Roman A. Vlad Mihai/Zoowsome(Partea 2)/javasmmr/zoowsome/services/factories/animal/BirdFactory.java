package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.PEAFOWL.equals(type)) {
			return new Peafowl(2.8,0.1);
		} else if (Constants.Animals.Birds.EAGLE.equals(type)) {
			return new Eagle(2.5,0.35);
		} else if (Constants.Animals.Birds.STORK.equals(type)) {
			return new Stork(3.6,0.22);
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
