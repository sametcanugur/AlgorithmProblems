package Sorular;

import java.util.Arrays;

public class TypingGame {

	public static void main(String[] args) {
		String array1[]= {"cat", "blue", "skt", "umbrells", "paddy"};
		String array2[]= {"cat", "blue", "sky", "umbrella", "paddy"};
		System.out.println(givenTwoArraysEqualsOrNot(array1,array2));
	}

	public static String givenTwoArraysEqualsOrNot(String[] array1, String[] array2) {

		int resultarray[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				resultarray[i] = 1;
			} else {
				resultarray[i] = -1;
			}
		}
		return Arrays.toString(resultarray);
	}
}
