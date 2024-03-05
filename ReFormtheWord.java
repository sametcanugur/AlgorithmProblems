package JavaExercises;

public class ReFormtheWord {

	public static void main(String[] args) {

		System.out.println(reformingWords("seas", "onal"));
	}

	public static String reformingWords(String word1, String word2) {

		String combined = word1 + word2;
		char charArray[] = combined.toCharArray();
		char convertedArray[] = new char[charArray.length - 1];
		String firstLetter = String.valueOf(combined.charAt(0));
		int k = 0;

		for (int i = 1; i < charArray.length; i++) {
			convertedArray[k] = charArray[i];
			k++;
		}
		String newWord = String.valueOf(convertedArray);
		return firstLetter.toUpperCase() + newWord;
	}
}
