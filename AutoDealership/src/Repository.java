
public class Repository {

	public static Dealership getDealership() {
		return new Dealership("NeelyCars", listOfCarLots());
	}

	private static CarLot[] listOfCarLots() {
		CarLot lot1 = new CarLot("Downtown", getListOfCars("Downtown"));
		CarLot lot2 = new CarLot("Northwest", getListOfCars("Northwest"));
		return new CarLot[] {lot1, lot2};
	}

	private static Vehicle[] getListOfCars(String location) {
		if (location.equals("Downtown")) {
			Vehicle car1 = new Vehicle("Honda", "Civic", 2356.87f);
			Vehicle car2 = new Vehicle("Honda", "Pilot", 12753.98f);
			Vehicle car3 = new Vehicle("Honda", "CRV", 8904.90f);
			Vehicle car4 = new Vehicle("Honda", "Accord", 7546.98f);
			return new Vehicle[] {car1, car2, car3, car4};
		}
		if (location.equals("Northwest")) {
			Vehicle car1 = new Vehicle("Chevrolet", "Malibu", 2356.87f);
			Vehicle car2 = new Vehicle("Chevrolet", "Impala", 12753.98f);
			Vehicle car3 = new Vehicle("Chevrolet", "Corvette", 108904.90f);
			Vehicle car4 = new Vehicle("Chevrolet", "Silverado", 7546.98f);
			return new Vehicle[] {car1, car2, car3, car4};
		}
		return new Vehicle[0];
	}
}