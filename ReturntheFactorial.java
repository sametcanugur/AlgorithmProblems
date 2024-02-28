package JavaExercises;

public class ReturntheFactorial {

	public static void main(String[] args) {
		System.out.println(factorialCalculator(5));

	}

	public static int factorialCalculator(int number) {
		int multiplied = 1;
		if (number < 0) {
			return -1;
		}
		
		for (int i = number; i >= 0; i--) {
			if (i > 0) {
				multiplied = multiplied * i;
			}
			if (number == 0) {
				return 1;
			}
		}
		return multiplied;
	}
}
