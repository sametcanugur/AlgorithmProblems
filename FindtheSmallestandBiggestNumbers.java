//Bubble Sort

package JavaExercises;

import java.util.Arrays;

public class FindtheSmallestandBiggestNumbers {

	public static void main(String[] args) {

		int array[] = { 3, 2, 1, 4, 5 };
		System.out.println(Arrays.toString(numberFinder(array)));
	}

	public static int[] numberFinder(int array[]) {

		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}
		return array;
	}
}
