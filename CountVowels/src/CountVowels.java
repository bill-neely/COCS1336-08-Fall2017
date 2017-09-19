
public class CountVowels {

	public static void main(String[] args) {
		System.out.println(isVowel('a') == true);
		System.out.println(isVowel('i') == true);
		System.out.println(isVowel('A') == true);
		System.out.println(isVowel('B') == false);
		System.out.println(countVowels("aeiOU") == 5);
		System.out.println(countVowels("Alphabet") == 3);
		System.out.println(countVowels("The quick brown fox jumps over the lazy dog") == 11);
	}

	private static boolean isVowel(char c) {
		return "AEIOUaeiou".contains(Character.toString(c));
	}

	private static int countVowels(String phrase) {
		int vowels = 0;
		for (int i = 0; i <= phrase.length() - 1; i++) {
			if (isVowel(phrase.charAt(i))) {
				vowels++;
			}
		}
		return vowels;
	}

	
}
