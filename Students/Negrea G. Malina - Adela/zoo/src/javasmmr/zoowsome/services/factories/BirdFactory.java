package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animal.Bird.Parrot.equals(type)) {
			return new Parrot();
		} else if (Constants.Animal.Bird.Pigeon.equals(type)) {
			return new Pigeon();
		} else if (Constants.Animal.Bird.Stork.equals(type)) {
			return new Stork();
		} else
			try {
				throw new Exception("Invalid species exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

}
