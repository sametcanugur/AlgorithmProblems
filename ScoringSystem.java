package JavaExercises;

public class ScoringSystem {

	public static void main(String[] args) {

		System.out.println(letterCounter("ABCBACC"));
	}

	public static int[] letterCounter(String letters) {

		int countA = 0;
		int countB = 0;
		int countC = 0;
		int array[] = { countA, countB, countC };

		for (int i = 0; i < letters.length(); i++) {
			if (letters.charAt(i) == 'A') {
				countA++;
			}
			if (letters.charAt(i) == 'B') {
				countB++;
			}
			if (letters.charAt(i) == 'C') {
				countC++;
			}
		}
		return array;
	}
}