package JavaExercises;

import java.util.ArrayList;

public class RemoveTheLettersABC {

	public static void main(String[] args) {

		System.out.println(removeLetter("selam"));
	}

	public static String removingLetter(String sentence) {

		ArrayList<String> list = new ArrayList<String>();
		String array[] = sentence.split("");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("a") || array[i].equals("b") || array[i].equals("c")) {
				array[i] = "x";
			}
		}
		for (int j = 0; j < array.length; j++) {
			list.add(array[j]);
			if (array[j].equals("x")) {
				count++;
			}
		}
		if (count == 0) {
			return null;
		}
		for (int k = 0; k < array.length; k++) {
			list.remove("x");
		}
		String result = String.join("", list);
		return result;
	}

	public static String removeLetter(String text) {
		if (text == null || text.isEmpty()) {
			return "";
		}
		
		String resultText = "";
		boolean check = false;
		char[] forbiddenLetters = { 'a', 'b', 'c' };
		
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < forbiddenLetters.length; j++) {
				if (text.charAt(i) == forbiddenLetters[j]) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
			if (!check) {
				resultText = resultText + text.charAt(i);
			}
		}
		return resultText;
	}
}
