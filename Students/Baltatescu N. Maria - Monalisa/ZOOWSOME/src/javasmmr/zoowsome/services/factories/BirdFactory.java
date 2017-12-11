package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Birds.Cock.equals(type)) {    
			return new Cock(new Boolean(false), new Integer(0), new Double(3.0), new Double(1.0)); 
		} 
		else if (Constants.Animals.Birds.Owl.equals(type)) {    
			return new Owl(new Boolean(false), new Integer(30), new Double(4.0), new Double(0.5));   
		}
		else //if (Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot(new Boolean(false), new Integer(30), new Double(6.0), new Double(0.1));
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
}
