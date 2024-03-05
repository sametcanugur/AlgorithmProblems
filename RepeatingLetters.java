package JavaExercises;

import java.util.Arrays;

public class RepeatingLetters {

	public static void main(String[] args) {

		System.out.println(letterRepeater("Hello World!"));
	}

	public static String letterRepeater(String text) {

		int k = 0;
		char firstArray[] = text.toCharArray();
		char resultArray[] = new char[firstArray.length * 2];
		for (int i = 0; i < text.length(); i++) {
			resultArray[k] = firstArray[i];
			resultArray[k + 1] = resultArray[k];
			k = k + 2;
		}
		String result = String.valueOf(resultArray);
		return result;
	}
}
