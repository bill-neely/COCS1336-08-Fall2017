import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeUI {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean keepPlaying = true;
		while (keepPlaying) {
			Yahtzee theGame = new Yahtzee();
			while (theGame.isNotOver()) {
				displayScoreCard(theGame);
				takeaTurn(theGame);
			}
			keepPlaying = playAgain();
		}
		System.out.println("Thank you, have a good day.");
		scan.close();
	}
	
	private static boolean playAgain() {
		return (askForString(scan, "Play Again?")).equals("Y");
	}

	public static String askForString(Scanner scan, String prompt) {
		System.out.println(prompt);
		String answer = scan.nextLine();
		return answer;
	}

	private static void takeaTurn(Yahtzee theGame) {
		System.out.println("You are starting a turn");
		theGame.startTurn();
	}

	private static void displayScoreCard(Yahtzee theGame) {
		System.out.println("The score card is dsiplayed:");
	}

	
	
	public static void takeATurn() {
		// while !TurnIsOver
			// theGame.rollDice()
			// displayScoringChoice(theGame)
			// If (rollagain?)
				// pick dice to discard
			// else
				// chooseAScore()
	}
	
	
	public static void rollingTest(String[] args) {
		ArrayList<Die> myDice = new ArrayList<Die>();
		myDice = getDice(myDice, 5);
		printOut(myDice);  // expect 5 dice
		
		myDice.remove(2);
		myDice.remove(1);
		printOut(myDice);  // expect 3 dice
		
		myDice = getDice(myDice, 5);
		printOut(myDice);  // expect 5, containg three from last
	}

	private static void printOut(ArrayList<Die> myDice) {
		System.out.println(" There are " + myDice.size() + " dice.");
		for (Die aDie : myDice)
			System.out.println(aDie.sideUp);
	}

	private static ArrayList<Die> getDice(ArrayList<Die> myDice, int numberToMake) {
		ArrayList<Die> myList = new ArrayList<Die>();
		for (Die startingDie : myDice)
			myList.add(startingDie);
		while (myList.size() < numberToMake)
			myList.add(new Die());
		return myList;
	}

}
