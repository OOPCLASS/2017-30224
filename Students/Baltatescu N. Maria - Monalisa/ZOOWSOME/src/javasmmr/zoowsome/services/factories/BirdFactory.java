package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Birds.Cock.equals(type)) {    
			return new Cock(false, 0, 3.0, 1.0); 
		} 
		else if (Constants.Animals.Birds.Owl.equals(type)) {    
			return new Owl(false, 30, 4.0, 0.5);   
		}
		else //if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(false, 30, 6.0, 0.1);
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
