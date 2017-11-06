package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animal.Aquatic.Carp.equals(type)) {
			return new Carp();
		} else if (Constants.Animal.Aquatic.Catfish.equals(type)) {
			return new Catfish();
		} else if (Constants.Animal.Aquatic.Goldfish.equals(type)) {
			return new Goldfish();
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
