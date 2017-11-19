package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class EmployeesFactory extends AbstractEmployeeFactory {
	public Employee getEmployee(String type, String name, double salary, boolean isDead){
		Caretaker caretaker = new Caretaker("default", 0.0, false);
		if(Constants.TypeOfEmployees.CARETAKER.equals(type))
			caretaker = new Caretaker(name, salary, isDead);
		return caretaker;
	}
	
}
