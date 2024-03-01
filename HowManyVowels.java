package JavaExercises;

public class HowManyVowels {

	public static void main(String[] args) {

		System.out.println(VowelFinder("Celebration"));
	}

	public static int VowelFinder(String word) {

		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
}
