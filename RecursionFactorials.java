package Sorular;

public class RecursionFactorials {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int number) {
		if (number > 1) {
			return number * factorial(number - 1);
		}
		return 1;
	}
}
