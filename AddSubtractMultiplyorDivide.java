package Sorular;

public class AddSubtractMultiplyorDivide {

	public static void main(String[] args) {

		System.out.println(operator(25, 1));
	}

	public static String operator(int number1, int number2) {
		if (number1 + number2 == 24) {
			return "added";
		} else if (number1 - number2 == 24) {
			return "subtracted";
		} else if (number1 / number2 == 24) {
			return "divided";
		} else if (number1 * number2 == 24) {
			return "multiplied";
		} else {
			return "none";
		}
	}
}