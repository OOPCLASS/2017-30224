package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Birds.Cock.equals(type)) {    
			return new Cock(); 
		} 
		else if (Constants.Animals.Birds.Owl.equals(type)) {    
			return new Owl();   
		}
		else //if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
