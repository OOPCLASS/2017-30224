package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory  extends SpeciesFactory{

	public Animal getAnimal(String type) {
		if (Constants.Animal.Mammal.Deer.equals(type)) {
			return new Deer();
		} else if (Constants.Animal.Mammal.Lion.equals(type)) {
			return new Lion();
		} else if (Constants.Animal.Mammal.Baboon.equals(type)) {
			return new Baboon();
		} else {
			try {
				throw new Exception("Invalid species exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
