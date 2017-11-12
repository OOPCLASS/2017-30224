package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory extends EmployeeAbstractFactory{

	public Employee getEmployee(String type) {
		if (Constants.EmployeeType.CaretakersType.CARETAKER.equals(type)){
			return new Caretaker();
		} else {
			try {
				throw new Exception("Invalid employee exception");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
				}	
			}
		}
}