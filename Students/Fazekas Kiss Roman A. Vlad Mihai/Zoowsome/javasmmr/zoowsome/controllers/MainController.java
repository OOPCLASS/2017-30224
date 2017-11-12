package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory(); 
		 
		  SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);   
		  Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);  
		  System.out.println(((Monkey) a1).getNormalBodyTemp());
		  System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		  

	}

}