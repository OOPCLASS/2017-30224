package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.models.animals.Animals;

import java.math.BigDecimal;

public class MainController {
	public static void main(String[] args) throws Exception {

		Boolean allAnimalsAreSafe = true;
		AnimalFactory abstractFactory = new AnimalFactory();
		EmployeeFactory abstractEmployeeFactory = new EmployeeFactory();

		SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammal);
		SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptile);
		SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Bird);
		SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatic);
		SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insect);

		Animals[] animals = new Animals[] { mammalFactory.getAnimal(Constants.Animals.Mammal.Elephant),
				insectFactory.getAnimal(Constants.Animals.Insect.Butterfly),
				aquaticFactory.getAnimal(Constants.Animals.Aquatic.Octopus),
				aquaticFactory.getAnimal(Constants.Animals.Aquatic.Dolphin),
				birdFactory.getAnimal(Constants.Animals.Bird.Pelican),
				birdFactory.getAnimal(Constants.Animals.Bird.Owl), birdFactory.getAnimal(Constants.Animals.Bird.Raven),
				reptileFactory.getAnimal(Constants.Animals.Reptile.Crocodile) };

		EmployeeAbstractFactory newEmployeeFactory = abstractEmployeeFactory
				.getEmployeeAbstractFactory(Constants.EmployeeFactories.CARETAKERS);

		Employee[] employees = new Employee[] {
				newEmployeeFactory.getEmployee(Constants.EmployeeType.CaretakersType.CARETAKER),
				new Caretaker("Robi", new BigDecimal((double) 550), false, 3.5),
				new Caretaker("Gabi", new BigDecimal((double) 880), false, (double) 4) };

		for (int i = 0; i < employees.length; i++) {
			for (int j = 0; j < animals.length; j++) {
				if ((!employees[i].getIsDead()) && (!animals[j].getTakenCareOf())) {
					String result = ((Caretaker) employees[i]).takenCareOf(animals[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						break;
					} else if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						employees[i].setIsDead(true);
					} else {
						animals[j].setTakenCareOf(true);
					}
				}
			}
		}

		for (int i = 0; i < animals.length; i++) {
			if (!animals[i].getTakenCareOf()) {
				allAnimalsAreSafe = false;
			}
		}

		if (allAnimalsAreSafe) {
			System.out.println("Everything is fine. All animals are safe!");
		} else {
			System.out.println("We have problems! There are animals that require attention!");
		}
	}
}