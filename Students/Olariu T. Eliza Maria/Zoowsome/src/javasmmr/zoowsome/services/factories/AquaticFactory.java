package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animals.Aquatics.Beaver.equals(type)) {
			return new Beaver();
		} else if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin();
		} else if (Constants.Animals.Aquatics.Hippopotamus.equals(type)) {
			return new Hippopotamus();
		} else {
			// throw new Exception("Invalid animal exception!");
			System.out.println("Invalid animal exception!");
			return null;
		}

	}
}
