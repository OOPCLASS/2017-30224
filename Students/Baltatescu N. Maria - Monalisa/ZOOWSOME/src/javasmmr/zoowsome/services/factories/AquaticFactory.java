package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Aquatics.CatFish.equals(type)) {    
			return new CatFish(30, WaterType.SALTWATER, 2.0, 0.2); 
		} 
		else if (Constants.Animals.Aquatics.Octopus.equals(type)) {    
			return new Octopus(500, WaterType.SALTWATER, 4.0, 0.3);   
		}
		else //if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(500, WaterType.SALTWATER, 5.0, 0.9);
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
	}

