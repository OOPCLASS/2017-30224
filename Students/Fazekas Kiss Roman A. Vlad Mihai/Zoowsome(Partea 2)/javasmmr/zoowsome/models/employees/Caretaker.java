package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private Double workingHours;

	public Caretaker(String name, BigDecimal salary, Boolean isDead, Double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super("Implicit_Caretaker_Name", new BigDecimal(500.0), false);
		this.workingHours = (double) 30;
	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();

		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
}
