
public class VehicleTester {

	public static void main(String[] args) {
		Vehicle myCar = new Vehicle("Honda", "Pilot", 2350.54f);
		System.out.println(myCar.make() == "Honda");
		System.out.println(myCar.model() == "Pilot");
		System.out.println(myCar.price() == 2350.54f);
	}

}
