package Sorular;

public class BothZeroNegativeorPositive {

	public static void main(String[] args) {
		System.out.println(checkNumbers(0,0));
	}

	public static boolean checkNumbers(int number1, int number2) {
		if ((number1 > 0 && number2 > 0) || (number1 < 0 && number2 < 0) || (number1 == 0 && number2 == 0)) {
			return true;
		}
		return false;
	}
}
