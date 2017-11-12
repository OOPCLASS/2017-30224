package javasmmr.zoowsome.services.factories.employee;

import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeAbstractFactory {

	public abstract Employee getEmployee(String type);
}
