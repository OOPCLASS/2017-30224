package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Insects.Ant.equals(type)) {    
			return new Ant(); 
		} 
		else if (Constants.Animals.Insects.Bee.equals(type)) {    
			return new Bee();   
		}
		else //if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
