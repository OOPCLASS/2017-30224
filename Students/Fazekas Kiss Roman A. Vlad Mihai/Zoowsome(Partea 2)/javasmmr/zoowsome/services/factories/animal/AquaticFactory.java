package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Aquatics;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Aquatics.DOLPHIN.equals(type)) {
			return new Dolphin(3.2, 0.1);
		} else if (Constants.Animals.Aquatics.SEAL.equals(type)) {
			return new Seal(3.4, 0.2);
		} else if (Constants.Animals.Aquatics.SHARK.equals(type)) {
			return new Shark(3.1, 0.7);
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
