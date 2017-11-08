package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] zoo = new Animal[50];
		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory0 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		int i = 0;

		for (i = 0; i < 50; i++) {
			if (i % 15 == 0) {
				zoo[i] = speciesFactory0.getAnimal(Constants.Animals.Mammals.Cow);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 1) {
				zoo[i] = speciesFactory0.getAnimal(Constants.Animals.Mammals.Monkey);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 2) {
				zoo[i] = speciesFactory0.getAnimal(Constants.Animals.Mammals.Tiger);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 3) {
				zoo[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Beaver);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 4) {
				zoo[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Dolphin);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 5) {
				zoo[i] = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Hippopotamus);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 6) {
				zoo[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Parrot);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 7) {
				zoo[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Penguin);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 8) {
				zoo[i] = speciesFactory2.getAnimal(Constants.Animals.Birds.Stork);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 9) {
				zoo[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Butterfly);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 10) {
				zoo[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Cockroach);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 11) {
				zoo[i] = speciesFactory3.getAnimal(Constants.Animals.Insects.Spider);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 12) {
				zoo[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Crocodile);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else if (i % 15 == 13) {
				zoo[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Lizard);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			} else {
				zoo[i] = speciesFactory4.getAnimal(Constants.Animals.Reptiles.Snake);
				System.out.printf("We have %d animal with %d legs!\n", i, zoo[i].getNrOfLegs());
			}

		}

		// AnimalFactory abstractFactory = new AnimalFactory();
		// SpeciesFactory speciesFactory1 =
		// abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		// Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		// System.out.printf("We have an animal with %d legs!\n",
		// a1.getNrOfLegs());

		// SpeciesFactory speciesFactory2 =
		// abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		// Animal a2 =
		// speciesFactory2.getAnimal(Constants.Animals.Aquatics.Dolphin);
		// System.out.printf("We have an animal with %s name!\n", a2.getName());
	}

}
