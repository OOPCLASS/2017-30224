
public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceCar s1 = new ServiceCar();
		Automobile c1 = new Car("ford", "focus");
		Automobile c2 = new Truck("scania", "1");
		s1.add(c1);
		s1.add(c2);
		s1.listAutomobile();
		s1.listCars();
		s1.listTruck();
		System.out.println("Number of cars:" + s1.getNrCars());
		System.out.println("Number of truck:" + s1.getNrTruck());

		if (s1.isFree() == true)
			System.out.println("Is free");
		else
			System.out.println("Is Full");

		System.out.println("Number of place in service:" + s1.NumberofPlace());

	}
}
