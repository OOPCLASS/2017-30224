package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class EmployeesFactory extends AbstractEmployeeFactory {
	public Employee getEmployee(String type, String name, Double salary, Boolean isDead, Integer id) {
		//long val = long(0.0);
		//Caretaker caretaker = new Caretaker("default", new Double(0.0), new Boolean(false), new Long(long(0.0)));
		//if(Constants.TypeOfEmployees.CARETAKER.equals(type))
			//Caretaker caretaker = new Caretaker(name, salary, isDead, id);
			return new Caretaker(name, salary, isDead, id);
	}
	
}
