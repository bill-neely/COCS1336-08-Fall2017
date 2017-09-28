
public class Vehicle {

	private String make;
	private String model;
	private float price;

	public Vehicle(String make, String model, float price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String make() {
		return this.make;
	}

	public String model() {
		return this.model;
	}

	public float price() {
		return this.price;
	}

}
