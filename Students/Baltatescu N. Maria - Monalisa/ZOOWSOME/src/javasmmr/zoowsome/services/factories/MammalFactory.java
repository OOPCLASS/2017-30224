package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Mammals.Tiger.equals(type)) {    
			return new Tiger(new Float(37.0), new Float(0.9), new Double(6.0), new Double(0.9)); 
		} 
		else if (Constants.Animals.Mammals.Dolphin.equals(type)) {    
			return new Dolphin(new Float(37.0), new Float(0.0), new Double(6.0), new Double(0.1));   
		}
		else //if (Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog(new Float(37.0), new Float(0.9), new Double(4.0), new Double(0.4));
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
	}

