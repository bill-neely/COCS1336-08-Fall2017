import java.util.Scanner;

public class MonthSelector {

	public static void main(String[] args) {
		String[] monthNames = new String[] {"Jan","Feb","Mar","Apr","May","Jun",
				"Jul","Aug", "Sep", "Oct", "Nov", "Dec"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 12");
		int number = Integer.parseInt(scan.nextLine());
		
		if (number <= 0 || number > monthNames.length - 1) {
			System.out.println("You have to choose a number between 1 and 12");
		} else {
			System.out.println(monthNames[number - 1]);
		}
		
		scan.close();
	}
		
}

