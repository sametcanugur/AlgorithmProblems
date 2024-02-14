package Sorular;

import java.util.Arrays;

public class InvertColors {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30 };
		System.out.println(Arrays.toString(invertor(array)) + " is the color black.");
	}

	public static int[] invertor(int array[]) {
		int invertarray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			invertarray[i] = 255 - array[i];
		}
		return invertarray;
	}
}
