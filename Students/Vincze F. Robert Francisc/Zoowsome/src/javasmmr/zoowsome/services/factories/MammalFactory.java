package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

	public Animals getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammal.Elephant.equals(type)) {
			return new Elephant(4,"Elephant",(float)35.9,10,7.1,4.5);
		} else if (Constants.Animals.Mammal.Tiger.equals(type)) {
			return new Tiger(4,"Tiger",(float)37.5,(float)37.8,5.9,0.9);
		} else if (Constants.Animals.Mammal.Zebra.equals(type)) {
			return new Zebra(4,"Zebra",(float)38.4,(float)22.5,3.3,3);
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
