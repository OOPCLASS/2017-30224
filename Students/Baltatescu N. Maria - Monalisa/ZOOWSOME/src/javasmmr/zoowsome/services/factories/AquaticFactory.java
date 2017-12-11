package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	
	@Override  
	public Animal getAnimal(String type) {   
		if (Constants.Animals.Aquatics.CatFish.equals(type)) {    
			return new CatFish(new Integer(30), WaterType.SALTWATER, new Double(2.0), new Double(0.2)); 
		} 
		else if (Constants.Animals.Aquatics.Octopus.equals(type)) {    
			return new Octopus(new Integer(500), WaterType.SALTWATER, new Double(4.0), new Double(0.3));   
		}
		else //if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(new Integer(500), WaterType.SALTWATER, new Double(5.0), new Double(0.9));
		/*}
		else {    
			throw new Exception(“Invalid animal exception!”);*/
		} 
	}

