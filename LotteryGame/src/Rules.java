
public class Rules {

	public static int howManyNumbersMatch(Ticket aTicket, int[] winningNumbers) {
		int numberFound = 0;
		for (int i = 0; i < aTicket.numbers().length; i++)
			for (int j = 0; j < winningNumbers.length; j++)
				if (aTicket.numbers()[i] == winningNumbers[j])
					numberFound++;
		return numberFound;
	}

	public static int prizeFor(int numbersMatched) {
		return 0;
	}

}
