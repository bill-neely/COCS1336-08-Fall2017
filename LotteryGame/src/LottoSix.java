
public class LottoSix {

	public int[] numberofTickets;
	public int[] prizeMoney;
	public Ticket[] ticketsSold;
	int[] winningNumbers;
	
	public LottoSix() {
		this.ticketsSold = new Ticket[0];
		this.numberofTickets = new int[7];
		this.prizeMoney = new int[7];		
	}

	public void calculateWinners() {
		for (Ticket aTicket : ticketsSold ) {
			int numbersMatched = Rules.howManyNumbersMatch(aTicket, winningNumbers);
			this.numberofTickets[numbersMatched]++; 
			int prize = Rules.prizeFor(numbersMatched);
			this.prizeMoney[numbersMatched] += prize;			
		}
		
	}

}
