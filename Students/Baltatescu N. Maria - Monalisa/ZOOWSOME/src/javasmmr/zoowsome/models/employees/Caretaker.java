package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;

	public Caretaker() { }
	public Caretaker(String name, double salary, boolean isDead) {
		super.setName(name);
		super.setSalary(salary);
		super.setIsDead(isDead);
		super.setId();
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal animal) {
		if (animal.kill())
			return Constants.Employees.Caretaker.TCO_KILLED;
		if (animal.maintenanceCost > workingHours)
			return Constants.Employees.Caretaker.TCO_NO_TIME;
		animal.setTakenCareOf(true);
		workingHours = workingHours - animal.maintenanceCost;
		return Constants.Employees.Caretaker.TCO_SUCCESS;
	}
}
