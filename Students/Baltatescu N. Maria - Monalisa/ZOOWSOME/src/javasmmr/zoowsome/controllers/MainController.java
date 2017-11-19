package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import java.util.Random;
import javasmmr.zoowsome.models.employees.*;

public class MainController {

	public static void main(String[] args) {
		/*
		 * AnimalFactory abstractFactory = new AnimalFactory();
		 * 
		 * String[] allSpecies = new String[15]; allSpecies[0] = "Tiger"; allSpecies[1]
		 * = "Dolphin"; allSpecies[2] = "Dog";
		 * 
		 * allSpecies[3] = "Snake"; allSpecies[4] = "Chameleon"; allSpecies[5] =
		 * "Turtle";
		 * 
		 * allSpecies[6] = "Owl"; allSpecies[7] = "Cock"; allSpecies[8] = "Parrot";
		 * 
		 * allSpecies[9] = "Shark"; allSpecies[10] = "Octopus"; allSpecies[11] =
		 * "CatFish";
		 * 
		 * allSpecies[12] = "Ant"; allSpecies[13] = "Bee"; allSpecies[14] = "Spider";
		 * 
		 * SpeciesFactory species; Animal[] animals = new Animal[50];
		 * 
		 * Random random = new Random(); for (int count = 0; count < 50; count++) { int
		 * nrOfSpecies = random.nextInt(5); // avem 5 specii int nrOfAnimalsPerSpecie =
		 * random.nextInt(2); // avem 3 animale pentru fiecare specie
		 * 
		 * if (nrOfSpecies == 0) { species =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Mammals); animals[count]
		 * = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie]); }
		 * 
		 * if (nrOfSpecies == 1) { species =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Reptiles); animals[count]
		 * = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 3]); }
		 * 
		 * if (nrOfSpecies == 2) { species =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Birds); animals[count] =
		 * species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 6]); }
		 * 
		 * if (nrOfSpecies == 3) { species =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Aquatics); animals[count]
		 * = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 9]); }
		 * 
		 * if (nrOfSpecies == 4) { species =
		 * abstractFactory.getSpeciesFactory(Constants.Species.Insects); animals[count]
		 * = species.getAnimal(allSpecies[nrOfAnimalsPerSpecie + 12]); } }
		 * 
		 * for (int count = 0; count < 50; count++) {
		 * System.out.println(animals[count].getName() + " " +
		 * animals[count].getNrOfLegs() + " " + animals[count].dangerPerc + " " +
		 * animals[count].maintenanceCost + " " + animals[count].getTakenCareOf()+
		 * "\n"); }
		 */

		Caretaker caretaker1 = new Caretaker("Popescu Ion", 1200.0, false);
		caretaker1.setWorkingHours(6.0);
		Caretaker caretaker2 = new Caretaker("Georgescu Maria", 1300.0, false);
		caretaker2.setWorkingHours(3.0);
		Caretaker caretaker3 = new Caretaker("Ionescu Vasile", 1250.0, false);
		caretaker3.setWorkingHours(8.0);
		Caretaker caretaker4 = new Caretaker("Lupescu Gheorghe", 1400.0, false);
		caretaker4.setWorkingHours(7.0);
		Caretaker caretaker5 = new Caretaker("Mircescu Teo", 1100.0, false);
		caretaker5.setWorkingHours(3.0);

		Caretaker[] caretakers = new Caretaker[] { caretaker1, caretaker2, caretaker3, caretaker4, caretaker5 };

		AnimalFactory animalFactory = new AnimalFactory();
		String[] typesOfAnimals = new String[] { "TIGER", "PARROT", "SHARK", "TURTLE", "ANT" };
		String[] typesOfSpecies = new String[] { "Mammals", "Birds", "Aquatics", "Reptiles", "Insects" };
		SpeciesFactory species;
		Animal[] animals = new Animal[5];

		for (int count = 0; count < 5; count++) {
			species = animalFactory.getSpeciesFactory(typesOfSpecies[count]);
			animals[count] = species.getAnimal(typesOfAnimals[count]);
		}

		for (int count = 0; count < 5; count++) {
			if (caretakers[count].getIsDead() == false && animals[count].getTakenCareOf() == false) {
				String result = caretakers[count].takeCareOf(animals[count]);
				if (result.equals(Constants.Employees.Caretaker.TCO_KILLED)) {
					caretakers[count].setIsDead(true);
					System.out.println(caretakers[count].getName() + " " + "is dead");
					continue;
				} else if (result.equals(Constants.Employees.Caretaker.TCO_NO_TIME)) {
					System.out.println(caretakers[count].getName() + " " + "doesn't have enough time!");
					continue;
				} else if (result.equals(Constants.Employees.Caretaker.TCO_SUCCESS)) {
					System.out.println(
							caretakers[count].getName() + " " + "take care of" + " " + animals[count].getName());
					animals[count].setTakenCareOf(true);
					continue;
				}
			}
		}

		for (int count = 0; count < animals.length; count++) {
			System.out.println(animals[count].getName() + " " + animals[count].getTakenCareOf());
		}

		System.out.println(caretaker4.getName() + " " + caretaker4.getWorkingHours());

		// Merge si pentru tabloul de animale creat random :)

	}

}
