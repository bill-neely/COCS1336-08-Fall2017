import java.util.Scanner;

public class DealerUI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dealership myDealer = Repository.getDealership();
		boolean keepGoing = true;
		while (keepGoing) {
			displayListOfCarLots(myDealer.CarLots());
			System.out.println("Please pick a Car Lot (enter return to quit):");
			String choice = scan.nextLine();
			if (choice.equals("return")) {
				keepGoing = false;	
			} else {
				int lotNumber = Integer.parseInt(choice) - 1;
				if (lotNumber >= 0 && lotNumber <= myDealer.CarLots().length - 1) {
					displayListOfVehicles(myDealer.CarLots()[lotNumber].Vehicles());
				}
			}
		}
		scan.close();
	}

	private static void displayListOfCarLots(CarLot[] lots) {
		for (int i = 0; i < lots.length; i++) {
			System.out.print((i + 1) + " - ");
			System.out.println(lots[i].location());
		}
	}
	
	private static void displayListOfVehicles(Vehicle[] listOfVehicles) {
		System.out.println("Make    \tModel\tPrice");
		System.out.println("--------\t-----\t-----");
		for (Vehicle car : listOfVehicles) {
			System.out.print(car.make() + "\t");
			System.out.print(car.model() + "\t");
			System.out.println("$" + car.price());
		}
	}

}
