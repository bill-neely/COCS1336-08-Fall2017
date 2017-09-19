public class FourMethods {

	public static void main(String[] args) {
		System.out.println(areaOfARectangle(4, 8) == 32);
	    System.out.println(average(23.0f, 45.0f, 90.0f) == 52.666668f);
	    System.out.println(charsAtTheEnd("This is a sentence", 6).equals("ntence"));
	    System.out.println(isPrimeNumber(7) == true);
	    System.out.println(isPrimeNumber(9) == false); 
	    System.out.println(isPrimeNumber(1) == false);
	    System.out.println(isPrimeNumber(-1) == false);
	}

	private static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number /2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static String charsAtTheEnd(String phrase, int numAtEnd) {
		return phrase.substring(phrase.length() - numAtEnd);
	}

	private static float average(float f, float g, float h) {
		return (f + g + h) / 3.0f; 
	}

	private static int areaOfARectangle(int length, int height) {
		return (length) * (height);
	}

}
