package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeFactory {

	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) {
		if (Constants.EmployeesFactories.CARETAKERS.equals(type)) {
			return new CaretakerFactory();
		} else
			try {
				throw new Exception("Invalid species exception");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	}
}
