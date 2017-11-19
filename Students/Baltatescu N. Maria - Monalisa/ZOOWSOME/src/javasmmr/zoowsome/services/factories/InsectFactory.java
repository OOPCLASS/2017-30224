package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Insects.Ant.equals(type)) {    
			return new Ant(false, false, 3.0, 0.1); 
		} 
		else if (Constants.Animals.Insects.Bee.equals(type)) {    
			return new Bee(true, true, 4.0, 0.4);   
		}
		else //if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(false, true, 3.0, 0.4);
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
