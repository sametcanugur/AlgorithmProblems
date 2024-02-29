package JavaExercises;

public class DoubleLetters {

	public static void main(String[] args) {

		System.out.println(letterCheck("loop"));
	}

	public static boolean letterCheck(String word) {

		int count = 0;
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == word.charAt(i + 1)) {
				count++;
			}
		}
		if (count > 0) {
			return true;
		}
		return false;
	}
}
