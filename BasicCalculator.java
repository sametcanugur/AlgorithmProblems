package JavaExercises;

public class BasicCalculator {

	public static void main(String[] args) {

		System.out.println(calculator(6, '+', 2));
	}

	public static int calculator(int number1, char operator, int number2) {

		if(number2==0) {
			return 0;
		}
		if (operator == '+') {
			return number1 + number2;
		}
		if (operator == '-') {
			return number1 - number2;
		}
		if (operator == '*') {
			return number1 * number2;
		}
		if (operator == '/') {
			return number1 / number2;
		}
		return -1;
	}
}
