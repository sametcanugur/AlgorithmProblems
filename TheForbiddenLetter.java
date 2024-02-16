package Sorular;

public class TheForbiddenLetter {

	public static void main(String[] args) {
		String array[] = {};
		System.out.println(forbiddenLetterCheck("m", array));
	}

	public static boolean forbiddenLetterCheck(String text, String array[]) {
		char letter = text.charAt(0);
		for (int i = 0; i < array.length; i++) {
			char character[] = array[i].toCharArray();
			for (int j = 0; j < character.length; j++) {
				if (letter == character[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
