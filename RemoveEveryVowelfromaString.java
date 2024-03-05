package JavaExercises;

import java.util.ArrayList;

public class RemoveEveryVowelfromaString {

	public static void main(String[] args) {

		System.out.println(vowelsRemoved("I have never seen a thin person drinking Diet Coke."));
	}

	public static String vowelsRemoved(String sentence) {
		ArrayList<String> list = new ArrayList<String>();
		String array[] = sentence.split("");
		for (int j = 0; j < array.length; j++) {
			if (array[j].equals("a") || array[j].equals("e") || array[j].equals("i") || array[j].equals("o")
					|| array[j].equals("u") || array[j].equals("A") || array[j].equals("E") || array[j].equals("I")
					|| array[j].equals("O") || array[j].equals("U")) {
				array[j] = "x";
			}
		}
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
			list.remove("x");
		}
		String listToString = String.join("", list);
		return listToString;
	}
}