package JavaExercises;

import java.util.Arrays;

public class GenerateaCountdownofNumbersinanArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(counter(5)));
	}

	public static int[] counter(int number) {

		int array[] = new int[-(0 - (number + 1))];
		for (int i = 0; i < array.length - 1; i++) {
			array[0] = number;
			array[i + 1] = array[i] - 1;
		}
		return array;
	}
}
