
public class ThreeOverloads {

	public static void main(String[] args) {
		say("This is a String");
		say(1000);
		say("$", 3.15f);
	}

	private static void say(String symbol, float myFloat) {
		say(symbol + Float.toString(myFloat));
	}

	private static void say(int myNumber) {
		say(Integer.toString(myNumber));
	}

	private static void say(String myString) {
		System.out.println(myString);
	}

}
