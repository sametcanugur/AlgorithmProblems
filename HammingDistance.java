package JavaExercises;

public class HammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistanceCalculator("abcde", "bcdef"));
	}

	public static int hammingDistanceCalculator(String text1, String text2) {
		int count = 0;
		for (int i = 0; i < text1.length(); i++) {
			if (text1.charAt(i) != text2.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
