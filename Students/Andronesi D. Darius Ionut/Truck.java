
public class Truck extends Automobile {

	public Truck(String model, String mark) {
		super(model, mark);
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getMark() {
		return this.mark;
	}

}
