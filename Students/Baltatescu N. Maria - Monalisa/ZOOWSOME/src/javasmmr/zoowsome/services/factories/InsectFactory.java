package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Insects.Ant.equals(type)) {    
			return new Ant(new Boolean(false), new Boolean(false), new Double(3.0), new Double(0.1)); 
		} 
		else if (Constants.Animals.Insects.Bee.equals(type)) {    
			return new Bee(new Boolean(true), new Boolean(true), new Double(4.0), new Double(0.4));   
		}
		else //if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider(new Boolean(false), new Boolean(true), new Double(3.0), new Double(0.4));
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
