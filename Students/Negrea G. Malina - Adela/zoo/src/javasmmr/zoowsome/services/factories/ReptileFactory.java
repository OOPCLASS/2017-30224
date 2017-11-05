package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {
		if (Constants.Animal.Reptile.Snail.equals(type)) {
			return new Snail();
		} else if (Constants.Animal.Reptile.Iguana.equals(type)) {
			return new Iguana();

		} else if (Constants.Animal.Reptile.Turtle.equals(type)) {
			return new Turtle();
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
