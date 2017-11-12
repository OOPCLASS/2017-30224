package javasmmr.zoowsome.services.factories.animal;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Mammals;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) {
		if (Constants.Animals.Mammals.TIGER.equals(type)) {
			return new Tiger(4.5, 0.8); 
		} else if (Constants.Animals.Mammals.MONKEY.equals(type)) {
			return new Monkey(6.0, 0.5);
		} else if (Constants.Animals.Mammals.COW.equals(type)) {
			return new Cow(3.0, 0.15);
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
