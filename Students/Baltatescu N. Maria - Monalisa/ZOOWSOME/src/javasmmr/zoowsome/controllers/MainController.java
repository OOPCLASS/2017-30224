package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import java.util.Random;

public class MainController {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();

		String[] allSpecies = new String[15];
		allSpecies[0] = "Tiger";
		allSpecies[1] = "Dolphin";
		allSpecies[2] = "Dog";

		allSpecies[3] = "Snake";
		allSpecies[4] = "Chameleon";
		allSpecies[5] = "Turtle";

		allSpecies[6] = "Owl";
		allSpecies[7] = "Cock";
		allSpecies[8] = "Parrot";

		allSpecies[9] = "Shark";
		allSpecies[10] = "Octopus";
		allSpecies[11] = "CatFish";

		allSpecies[12] = "Ant";
		allSpecies[13] = "Bee";
		allSpecies[14] = "Spider";

		SpeciesFactory species;
		Animal[] animals = new Animal[50];

		Random random = new Random();
		for (int count = 0; count < 50; count++) {
			int nrOfSpecies = random.nextInt(5); // avem 5 specii
			int nrOfAnimalsPerSpecie = random.nextInt(2); // avem 3 animale pentru fiecare specie

			if (nrOfSpecies == 0) {
				species = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
				animals[count] = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie]);
			}

			if (nrOfSpecies == 1) {
				species = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
				animals[count] = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 3]);
			}

			if (nrOfSpecies == 2) {
				species = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
				animals[count] = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 6]);
			}

			if (nrOfSpecies == 3) {
				species = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
				animals[count] = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 9]);
			}

			if (nrOfSpecies == 4) {
				species = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
				animals[count] = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 12]);
			}
		}

		for (int count = 0; count < 50; count++) {
			System.out.println(animals[count].getName() + " " + animals[count].getNrOfLegs() + "\n");
		}
	}

}
