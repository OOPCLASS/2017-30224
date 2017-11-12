package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Insects;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Insects.BUTTERFLY.equals(type)) {
			return new Butterfly(0.2, 0.01);
		} else if (Constants.Animals.Insects.SPIDER.equals(type)) {
			return new Spider(0.3, 0.4);
		} else if (Constants.Animals.Insects.COCKROACH.equals(type)) {
			return new Cockroach(0.1, 0.08);
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
