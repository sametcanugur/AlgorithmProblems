package Sorular;

public class CalculateDeterminantofa2x2Matrix {

	public static void main(String[] args) {
		int[][] array = { { 5, 3 }, { 3, 1 } };
		System.out.println(calculateDeterminantOf2x2Matrix(array));
	}

	public static int calculateDeterminantOf2x2Matrix(int[][] array) {
		int array1[][] = new int[2][2];
		array1 = array;
		int result = array1[0][0] * array1[1][1] - array1[0][1] * array1[1][0];
		return result;
	}
}
