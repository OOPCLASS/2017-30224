package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeFactory {

	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) {
		if (Constants.EmployeeFactories.CARETAKERS.equals(type)) {
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
