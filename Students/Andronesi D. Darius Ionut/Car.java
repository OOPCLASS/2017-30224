
public class Car extends Automobile {

	public Car(String mark, String model) {
		super(mark, model);
	}

	@Override
	public String getMark() {
		return this.mark;
	}

	@Override
	public String getModel() {
		return this.model;
	}

}
