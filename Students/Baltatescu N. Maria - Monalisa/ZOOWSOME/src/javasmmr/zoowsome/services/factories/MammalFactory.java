package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Mammals.Tiger.equals(type)) {    
			return new Tiger((float)37.0, (float)0.9, 6.0, 0.9); 
		} 
		else if (Constants.Animals.Mammals.Dolphin.equals(type)) {    
			return new Dolphin((float)37.0, (float)0.0, 6.0, 0.1);   
		}
		else //if (Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog((float)37.0, (float)0.9, 4.0, 0.4);
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
	}

