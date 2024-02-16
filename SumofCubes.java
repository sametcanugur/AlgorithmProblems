package Sorular;

public class SumofCubes {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4 };
		System.out.println(sumOfCubes(array));
	}

	public static int sumOfCubes(int[] array) {

		int result = 0;
		int array2[] = new int[array.length];
		array2 = array;
		for (int i = 0; i < array2.length; i++) {
			result = result + (array2[i] * array2[i] * array2[i]);
		}
		return result;
	}
}
