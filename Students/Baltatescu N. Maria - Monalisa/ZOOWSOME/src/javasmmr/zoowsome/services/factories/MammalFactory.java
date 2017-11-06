package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Mammals.Tiger.equals(type)) {    
			return new Tiger(); 
		} 
		else if (Constants.Animals.Mammals.Dolphin.equals(type)) {    
			return new Dolphin();   
		}
		else //if (Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog();
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
	}

