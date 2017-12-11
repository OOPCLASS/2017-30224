package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class CaretakerFactory extends EmployeeAbstractFactory {

	public Employee getEmployee(String type) throws Exception {
		if (Constants.EmployeeType.CaretakersType.CARETAKER.equals(type)) {
			return new Caretaker();
		} else {
			throw new Exception("Invalid employee exception");
		}
	}
}
