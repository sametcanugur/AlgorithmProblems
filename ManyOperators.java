package JavaExercises;

public class ManyOperators {

	public static void main(String[] args) {

		System.out.println(calculatorProgramme(7,10,"-"));
	}

	public static int calculatorProgramme(int parameter1, int parameter2, String operator) {

		if (parameter2 == 0) {
			return -1;
		}
		if (operator == "+") {
			return parameter1 + parameter2;
		}
		if (operator == "-") {
			return parameter1 - parameter2;
		}
		if (operator == "*") {
			return parameter1 * parameter2;
		}
		if (operator == "/") {
			return parameter1 / parameter2;
		}
		if (operator == "%") {
			return parameter1 % parameter2;
		}
		return -1;
	}
}
