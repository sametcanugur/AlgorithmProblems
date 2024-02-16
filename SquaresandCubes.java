package Sorular;

public class SquaresandCubes {

	public static void main(String[] args) {
		double array[] = { 36, 216, 7 };
		System.out.println(calculateOperation(array));
	}

	public static boolean calculateOperation(double array[]) {
		double x = Math.sqrt(array[0]);
		if (x * x * x == array[1]) {
			return true;
		}
		return false;
	}
}
