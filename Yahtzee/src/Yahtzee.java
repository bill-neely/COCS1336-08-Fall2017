import java.util.ArrayList;
import java.util.Arrays;

public class Yahtzee {

	private int turnsLeft;
	private int rollsLeft;
	private boolean inATurn;
	private ArrayList<Die> dice;
	private YahtzeeScoreCard scoreCard;

	public Yahtzee() {
		this.inATurn = false;
		this.turnsLeft = 13;
		this.rollsLeft = 0;
		this.dice = new ArrayList<Die>();
		this.scoreCard = new YahtzeeScoreCard();
	}

	public ArrayList<Die> dice() {
		return this.dice;
	}

	public void eliminateDie(String remove) {
		ArrayList<Die> newDice = new ArrayList<Die>();
		String[] removes = remove.split(" ");
		for (int i = 0; i < this.dice.size(); i++) {
			String humanIndex = Integer.toString(i+1);
			if (!Arrays.asList(removes).contains(humanIndex)) {
				newDice.add(this.dice.get(i));
			}
		}
		this.dice = newDice;
	}

	public boolean inATurn() {
		return this.inATurn;
	}

	public boolean isNotOver() {
		return (this.turnsLeft != 0);
	}

	public void pickAScore(int row) {
		this.scoreCard.rows(this.dice)[row].recordScore();
		this.inATurn = false;
	}

	public void roll() {
		while (this.dice.size() < 5)
			this.dice.add(new Die());
		this.rollsLeft--;
	}

	public int rollsLeft() {
		return this.rollsLeft;
	}

	public YahtzeeScoreCard scoreCard() {
		return this.scoreCard;
	}

	public void startTurn() {
		this.inATurn = true;
		this.turnsLeft--;
		this.rollsLeft = 3;
		this.dice.clear();
		this.roll();
	}

	public int turnsLeft() {
		return this.turnsLeft;
	}



}
