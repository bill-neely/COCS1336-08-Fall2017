import java.util.Scanner;

public class DealerUI {

		
	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		Dealership myDealer = Repository.getDealership();
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Your shopping cart balance is: " + myCart.balanceDue());
			displayListOfCarLots(myDealer.CarLots());
			String choice = ask("Please pick a Car Lot (enter return to quit):");
			if (choice.equals("return")) {
				keepGoing = false;	
			} else {
				int lotNumber = Integer.parseInt(choice) - 1;
				if (lotNumber >= 0 && lotNumber <= myDealer.CarLots().length - 1) {
					CarLot chosenLot = myDealer.CarLots()[lotNumber];
					displayListOfVehicles(chosenLot.Vehicles());
					String vehicleChoice = ask("Please pick a car:");
					int vehicleNumber = Integer.parseInt(vehicleChoice) - 1;
					if (vehicleNumber >= 0 && vehicleNumber <= chosenLot.Vehicles().length - 1) {
						String quantityChoice = ask("How many do you wish to buy?");
						int qty = Integer.parseInt(quantityChoice);
						myCart.addVehicle(chosenLot.Vehicles()[vehicleNumber], qty);
					}
				}
			}
		}
		System.out.println("Thank you for shopping.  Your balance is " + myCart.balanceDue());
	}

	private static void displayListOfCarLots(CarLot[] lots) {
		for (int i = 0; i < lots.length; i++) {
			System.out.print((i + 1) + " - ");
			System.out.println(lots[i].location());
		}
	}
	
	private static String ask(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.println(prompt);
		String choice = scan.nextLine();
		//scan.close();
		return choice;
	}
	
	private static void displayListOfVehicles(Vehicle[] listOfVehicles) {
		System.out.println("\tMake    \tModel\tPrice");
		System.out.println("---\t--------\t-----\t-----");
		int i = 1;
		for (Vehicle car : listOfVehicles) {
			System.out.print(i + "\t");
			System.out.print(car.make() + "\t");
			System.out.print(car.model() + "\t");
			System.out.println("$" + car.price());
			i++;
		}
	}

}
