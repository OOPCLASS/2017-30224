package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController 
{
	public static void main(String[] args) throws Exception 
	{
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Zebra);
		System.out.printf("We have an animal with %d legs and it is a %s!\n", a1.getNrOfLegs(), a1.getName());
	}
		
}
