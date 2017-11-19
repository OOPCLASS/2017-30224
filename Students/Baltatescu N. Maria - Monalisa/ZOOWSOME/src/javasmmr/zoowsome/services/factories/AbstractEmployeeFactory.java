package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public abstract class AbstractEmployeeFactory {
	public abstract Employee getEmployee(String type, String name, double salary, boolean isDead);
}
