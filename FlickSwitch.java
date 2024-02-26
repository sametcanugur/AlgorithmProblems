package JavaExercises;

import java.util.Arrays;

public class FlickSwitch {

	public static void main(String[] args) {

		Object array[] = { "flick", "flick", true, false, 3, "flick" };
		System.out.println(Arrays.toString(finderFlick(array)));
	}

	public static boolean[] finderFlick(Object[] array) {

		boolean resultArray[] = new boolean[array.length];
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("flick")) {
				count++;
			}
			if (count % 2 == 1) {
				resultArray[i] = false;
			} else {
				resultArray[i] = true;
			}
		}
		return resultArray;
	}
}
