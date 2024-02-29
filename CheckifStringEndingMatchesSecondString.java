package JavaExercises;

public class CheckifStringEndingMatchesSecondString {

	public static void main(String[] args) {

		System.out.println(checkLetter("feminine", "nine"));
	}

	public static boolean checkLetter(String word1, String word2) {

		char firstArray[] = word1.toCharArray();
		char secondArray[] = word2.toCharArray();
		char resultFirstArray[] = new char[secondArray.length];
		int k = 0;
		int count = 0;

		for (int i = firstArray.length - secondArray.length; i < firstArray.length; i++) {
			resultFirstArray[k] = firstArray[i];
			k++;
		}
		for (int j = 0; j < secondArray.length; j++) {
			if (resultFirstArray[j] == secondArray[j]) {
				count++;
			}
		}
		if (count == secondArray.length) {
			return true;
		}
		return false;
	}
}