
public class DealerUI {

	public static void main(String[] args) {
		//Vehicle[] myCars = getListOfCars();
		//displayListOfVehicles(myCars);
		displayListOfCarLots(getListOfCarLots());
	}

	private static void displayListOfCarLots(CarLot[] lots) {
		for (int i = 0; i < lots.length; i++) {
			System.out.print((i + 1) + " - ");
			System.out.println(lots[i].location());
		}
	}
	
	private static void displayListOfVehicles(Vehicle[] listOfVehicles) {
		System.out.println("Make\tModel\tPrice");
		System.out.println("----\t-----\t-----");
		for (Vehicle car : listOfVehicles) {
			System.out.print(car.make() + "\t");
			System.out.print(car.model() + "\t");
			System.out.println("$" + car.price());
		}
	}
	
	private static CarLot[] getListOfCarLots() {
		CarLot lot1 = new CarLot("Downtown", getListOfCars());
		CarLot lot2 = new CarLot("Northwest", getListOfCars());
		return new CarLot[] {lot1, lot2};
	}
	
	private static Vehicle[] getListOfCars() {
		// TODO: Move this to a repository
		Vehicle car1 = new Vehicle("Honda", "Civic", 2356.87f);
		Vehicle car2 = new Vehicle("Ford", "F350", 12753.98f);
		return new Vehicle[] {car1, car2};
	}

}
