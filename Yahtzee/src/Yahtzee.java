
public class Yahtzee {
	
	private boolean isNotOver;
	private int turnsLeft;
	
	public Yahtzee() {
		this.isNotOver = true;
		this.turnsLeft = 13;
	}
	
	public boolean isNotOver() {
		return this.isNotOver;
	}

	public void startTurn() {
		this.turnsLeft--;
		if (this.turnsLeft == 0) {
			this.isNotOver = false;
		}
	}

}
