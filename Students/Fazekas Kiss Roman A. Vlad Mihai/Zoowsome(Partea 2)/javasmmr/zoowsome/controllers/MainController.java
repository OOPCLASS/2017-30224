package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employee.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.employee.EmployeeFactory;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args) {
		Boolean allAnimalsTakenCareOf = true;
		AnimalFactory abstractFactory = new AnimalFactory();
		EmployeeFactory abstractEmployeeFactory = new EmployeeFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);

		Animal[] aa = new Animal[] { speciesFactory1.getAnimal(Constants.Animals.Mammals.COW),
				speciesFactory2.getAnimal(Constants.Animals.Aquatics.DOLPHIN),
				speciesFactory3.getAnimal(Constants.Animals.Reptiles.LIZARD),
				speciesFactory4.getAnimal(Constants.Animals.Insects.BUTTERFLY),
				speciesFactory5.getAnimal(Constants.Animals.Birds.EAGLE) };

		EmployeeAbstractFactory employeeFactory1 = abstractEmployeeFactory.getEmployeeAbstractFactory(Constants.EmployeesFactories.CARETAKERS);
		Employee[] ee = new Employee[] { employeeFactory1.getEmployee(Constants.EmployeeType.CaretakersType.CARETAKER),
				employeeFactory1.getEmployee(Constants.EmployeeType.CaretakersType.CARETAKER),
				new Caretaker("John", new BigDecimal(700.0), false, 3.0) };

		for (int i = 0; i < ee.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				if ((!ee[i].getIsDead()) && (!aa[j].getTakenCareOf())) {
					String result = ((Caretaker) ee[i]).takeCareOf(aa[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						ee[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						break;
					} else {
						aa[j].setTakenCareOf(true);
					}
				}
			}
		}
		for (int i = 0; i < ee.length; i++) {
			System.out.println(ee[i].getId());
			System.out.println(ee[i].getIsDead());
			System.out.println("-------------------");
		}

		for (int i = 0; i < aa.length; i++) {
			if (!aa[i].getTakenCareOf()) {
				allAnimalsTakenCareOf = false;
			}
		}

		if (allAnimalsTakenCareOf) {
			System.out.println("All animals have been taken care of.");
		} else {
			System.out.println("There are animals that need attention!");
		}

	}

}
