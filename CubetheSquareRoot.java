package Sorular;

public class CubetheSquareRoot {

	public static void main(String[] args) {
		System.out.println(cubeTheSquareRoot(16, 3));
	}

	public static double cubeTheSquareRoot(double number, int exponentialDegree) {
		double result = 1;
		double squaretedNumber = Math.sqrt(number);
		for (int i = 0; i < exponentialDegree; i++) {
			result = result * squaretedNumber;
		}
		return result;
	}
}
