import java.util.Scanner;

public class DealerUI {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ShoppingCart myCart = new ShoppingCart();
		Dealership myDealer = Repository.getDealership();
		boolean keepGoing = true;
		String customerName = ask("What is your name?");
		System.out.println("Hello " + customerName + ". Welcome to " + myDealer.dealerName() + ".");
		while (keepGoing) {
			System.out.println("Your shopping cart balance is: " + myCart.balanceDue());
			displayListOfCarLots(myDealer.CarLots());
			String choice = ask("Please pick a Car Lot (enter return to quit):");
			if (choice.equals("return")) {
				keepGoing = false;	
			} else {
				displayAndSelectVehicle(myDealer, choice, myCart);
			}
		}
		System.out.println("Thank you for shopping " + customerName);
		System.out.println("Your balance is " + myCart.balanceDue());
		scan.close();
	}

	private static void displayAndSelectVehicle(Dealership myDealer, String lotChoice, ShoppingCart myCart) {
		int lotNumber = Integer.parseInt(lotChoice) - 1;
		if (lotNumber >= 0 && lotNumber <= myDealer.CarLots().length - 1) {
			CarLot chosenLot = myDealer.CarLots()[lotNumber];
			displayListOfVehicles(chosenLot.Vehicles());
			int vehicleNumber = askForInt("Please pick a car:") - 1;
			if (vehicleNumber >= 0 && vehicleNumber <= chosenLot.Vehicles().length - 1) {
				int qty = askForInt("How many do you wish to buy?");
				if (myCart.addVehicle(chosenLot.Vehicles()[vehicleNumber], qty))
					System.out.println(qty + " of '" + chosenLot.Vehicles()[vehicleNumber].model() + "' added to your cart.");
				else
					System.out.println("Sorry. We don't have that many");
			}
		}
	}
	
	private static void displayListOfCarLots(CarLot[] lots) {
		for (int i = 0; i < lots.length; i++) {
			System.out.print((i + 1) + " - ");
			System.out.println(lots[i].location());
		}
	}
	
	private static String ask(String prompt) {
		System.out.println(prompt);
		String choice = scan.nextLine();
		return choice;
	}

	private static int askForInt(String prompt) {
		return Integer.parseInt(ask(prompt));
	}
	
	private static void displayListOfVehicles(Vehicle[] listOfVehicles) {
		System.out.println("\tMake    \tModel\tPrice\t\tQty");
		System.out.println("---\t--------\t-----\t-----\t\t---");
		int i = 1;
		for (Vehicle car : listOfVehicles) {
			System.out.print(i + "\t");
			System.out.print(car.make() + "\t");
			System.out.print(car.model() + "\t");
			System.out.print("$" + car.price() + "\t\t");
			System.out.println(car.quantity());
			i++;
		}
	}

}
