
public class ShoppingCart {

	private Vehicle[] Vehicles;
	private int numberOfCars;

	public ShoppingCart() {
		this.Vehicles = new Vehicle[20];
		numberOfCars = 0;
	}
	
	public Vehicle[] Vehicles() {
		return this.Vehicles;
	}

	public void addVehicle(Vehicle car, int quantity) {
		this.Vehicles[numberOfCars] = car.clone(quantity);
		numberOfCars++;
	}

	public float balanceDue() {
		float balanceDue = 0;
		for (int i = 0; i < numberOfCars; i++) {
			balanceDue += this.Vehicles[i].price() * this.Vehicles[i].quantity();
		}
		return balanceDue;
	}

}
