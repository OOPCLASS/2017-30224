
public class ServiceCar {
	// max:10 car
	private Automobile[] a;
	int numberOfAutomobile = 0;

	public ServiceCar() {
		this.a = new Automobile[10];
	}

	public void add(Automobile au) {
		this.a[numberOfAutomobile] = au;
		this.numberOfAutomobile = this.numberOfAutomobile + 1;
	}

	public void listAutomobile() {
		for (int i = 0; i < numberOfAutomobile; i++) {
			System.out.println(a[i].getMark() + " " + a[i].getModel());
		}
	}

	public void listCars() {
		for (int i = 0; i < numberOfAutomobile; i++) {
			if (this.a[i] instanceof Car) {
				System.out.println(a[i].getMark() + " " + a[i].getModel());

			}
		}
	}

	public void listTruck() {
		for (int i = 0; i < numberOfAutomobile; i++) {
			if (this.a[i] instanceof Truck) {
				System.out.println(a[i].getMark() + " " + a[i].getModel());

			}
		}
	}

	public int getNrAutomobile() {
		return this.numberOfAutomobile;
	}

	public int getNrCars() {
		int nrCars = 0;
		for (int i = 0; i < this.numberOfAutomobile; i++) {
			if (a[i] instanceof Car) {
				nrCars += 1;
			}
		}
		return nrCars;
	}

	public int getNrTruck() {
		int nrTruck = 0;
		for (int i = 0; i < this.numberOfAutomobile; i++) {
			if (a[i] instanceof Truck) {
				nrTruck += 1;
			}
		}
		return nrTruck;
	}

	public boolean isFree() {
		if (this.numberOfAutomobile < a.length)
			return true;
		else
			return false;
	}

	public int NumberofPlace() {
		int numberofplace = 0;
		numberofplace = a.length - this.numberOfAutomobile;
		return numberofplace;

	}

}
