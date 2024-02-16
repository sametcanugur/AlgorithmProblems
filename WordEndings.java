package Sorular;

import java.util.Arrays;

public class WordEndings {

	public static void main(String[] args) {
		String array[] = { "clever", "meek", "hurried", "nice" };
		System.out.println(addWordToEndOfTheWord(array));
	}

	public static String addWordToEndOfTheWord(String[] array) {
		String resultarray[] = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			resultarray[i] = array[i] + "ly";
		}
		return Arrays.toString(resultarray);
	}
}
