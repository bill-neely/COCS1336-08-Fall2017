
public class LottoUI {

	public static void main(String[] args) {
		LottoSix theGame = new LottoSix();
		// Ask user how many to sell;
		// theGame.sellTickets(n);
		// theGame.drawNumbers();
		theGame.calculateWinners();
		printTicketSummary(theGame);
	}

	public static void printTicketSummary(LottoSix theGame) {
		for (int i = 0; i < 7; i++)
			System.out.println(theGame.numberofTickets[i] + " tickets matched " + i + " numbers and won $" + theGame.prizeMoney[i]);
	}
	
}

//n tickets matched 0 numbers and won a total $0
//n tickets matched 1 number and won a total $0
//n tickets matched 2 numbers and won a total of $0
//n tickets matched 3 numbers and won a total of $n
//n tickets matched 4 numbers and won a total of $n
//n tickets matched 5 numbers and won a total of $n
//n tickets matched 6 numbers and won a total of $n
