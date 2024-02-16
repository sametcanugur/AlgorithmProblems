package Sorular;

public class UsingtheandOperator {

	public static void main(String[] args) {
		System.out.println(checkProgram(5,6));
	}

	public static boolean checkProgram(int number1, int number2) {
		if (number1 == number2) {
			return true;
		}
		return false;
	}
}
