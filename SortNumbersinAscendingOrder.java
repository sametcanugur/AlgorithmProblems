package JavaExercises;

import java.util.Arrays;

public class SortNumbersinAscendingOrder {

	public static void main(String[] args) {

		int array[] = {};
		System.out.println(Arrays.toString(sorter(null)));
	}

	public static int[] sorter(int array[]) {

		if (array == null) {
			return new int[] {};
		}

		int k = 0;
		int m = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = m; j < array.length; j++) {
				if (array[i] > array[j]) {
					k = array[j];
					array[j] = array[i];
					array[i] = k;
				}
			}
			m++;
		}
		return array;
	}
}
