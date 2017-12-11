package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Reptiles.Snake.equals(type)) {    
			return new Snake(new Boolean(true), new Double(7.0), new Double(0.9)); 
		} 
		else if (Constants.Animals.Reptiles.Chameleon.equals(type)) {    
			return new Chameleon(new Boolean(true), new Double(4.0), new Double(0.3));   
		}
		else //if (Constants.Animals.Reptiles.Turtle.equals(type)) {
			return new Turtle(new Boolean(true), new Double(5.0), new Double(0.1));
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);
		} */
	}
}
