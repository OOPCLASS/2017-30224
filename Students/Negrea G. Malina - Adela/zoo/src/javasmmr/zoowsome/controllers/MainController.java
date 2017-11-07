package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class MainController {

	public static void main(String[] args) {

		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animal.Mammal.Baboon);
		System.out.println("The new animal is a " + a1.getAnimalType() + " called " + a1.getName());

		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animal.Bird.Parrot);
		System.out.println("The new animal is a " + a2.getAnimalType() + " called " + a2.getName());

		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		Animal a3 = speciesFactory3.getAnimal(Constants.Animal.Aquatic.Carp);
		System.out.println(a3.getName() + " have " + a3.getNrOfLegs() + " fins");

		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Insect);
		Animal a4 = speciesFactory4.getAnimal(Constants.Animal.Insect.Butterfly);
		System.out.println(a4.getName() + " have " + a4.getNrOfLegs() + " legs");

		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		Animal a5 = speciesFactory5.getAnimal(Constants.Animal.Reptile.Turtle);
		a5.setName("Leopard tortoise");
		System.out.println("The new animal is a " + a5.getAnimalType() + " called " + a5.getName());

	}

}
