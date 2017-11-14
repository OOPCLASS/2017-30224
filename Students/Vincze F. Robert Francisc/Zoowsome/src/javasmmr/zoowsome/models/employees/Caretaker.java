package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private Double workingHours;

	public Caretaker(String name, BigDecimal salary, Boolean isDead, double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super("Tom Marvolo Riddle", new BigDecimal(400), false);
		this.workingHours = (double) 40;
	}

	public Double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takenCareOf(Animals animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
}
