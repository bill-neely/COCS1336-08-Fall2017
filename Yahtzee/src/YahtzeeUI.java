import java.util.ArrayList;

public class YahtzeeUI {

	public static void main(String[] args) {
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
		for (int i = 0; i < numberToMake; i++) {
			myList.add(new Die());
		}
		return myList;
	}

}
