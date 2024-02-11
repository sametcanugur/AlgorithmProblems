package Sorular;

public class CountSyllables {

	public static void main(String[] args) {
		System.out.println(countSyllables("selamlan"));
	}

	public static int countSyllables(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == '-') {
				count++;
			}
		}
		int result = count + 1;
		return result;
	}
}
