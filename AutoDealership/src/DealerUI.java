
public class DealerUI {

	public static void main(String[] args) {
		Vehicle[] myCars = getListOfCars();
		System.out.println("Make\tModel\tPrice");
		System.out.println("----\t-----\t-----");
		for (Vehicle car : myCars) {
			System.out.print(car.make() + "\t");
			System.out.print(car.model() + "\t");
			System.out.println("$" + car.price());
		}
	}

	private static Vehicle[] getListOfCars() {
		// TODO: Move this to a repository
		Vehicle car1 = new Vehicle("Honda", "Civic", 2356.87f);
		Vehicle car2 = new Vehicle("Ford", "F350", 12753.98f);
		return new Vehicle[] {car1, car2};
	}

}
