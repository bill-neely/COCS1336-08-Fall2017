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

	public static String askForString(Scanner scan, String prompt) {
		System.out.println(prompt);
		String answer = scan.nextLine();
		return answer;
	}

	private static void displayDice(Yahtzee theGame) {
		for (Die aDie : theGame.dice()) 
			System.out.print(aDie.sideUp + "\t");
		System.out.println();
	}

	private static void displayScoreCard(Yahtzee theGame) {
		System.out.println("The score card is dsiplayed:");
	}

	private static void displayScoreOptionsAndPick(Yahtzee theGame) {
		System.out.println("  Please pick a score:");
		theGame.pickAScore();
	}

	private static void eliminateDice(Yahtzee theGame) {
		String dieNumber = askForString(scan, "Choose die#, (R)oll");
		if (dieNumber.toUpperCase().equals("R"))
			theGame.roll();			
		else 
			theGame.eliminateDie(dieNumber);
	}

	private static void eliminateDiceOrAskToScore(Yahtzee theGame) {
		String choice = askForString(scan, "(R)oll or (S)core?");
		if (choice.toUpperCase().equals("S")) { 
			displayScoreOptionsAndPick(theGame);
		} else {
			eliminateDice(theGame);
		}
	}

	private static boolean playAgain() {
		return (askForString(scan, "Play Again?")).equals("Y");
	}

	private static void takeaTurn(Yahtzee theGame) {
		System.out.println(" You are starting a turn");
		theGame.startTurn();
		while (theGame.inATurn()) {
			displayDice(theGame);
			// roll again or pick score
			if (theGame.rollsLeft() > 0)
				eliminateDiceOrAskToScore(theGame);
			else
				displayScoreOptionsAndPick(theGame);
		}
	}

}
