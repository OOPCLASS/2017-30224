package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animal.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animal.Insect.Ladybird.equals(type)) {
			return new Ladybird();
		} else if (Constants.Animal.Insect.Millipede.equals(type)) {
			return new Millipede();
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
