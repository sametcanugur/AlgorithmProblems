package JavaExercises;

public class AlgorithmsIIntroductiontoRecursion {

	public static void main(String[] args) {
		System.out.println(factorialWithRecursion(5));
	}

	public static int factorialWithRecursion(int number) {
		if (number > 0) {
			return number * factorialWithRecursion(number - 1);
		} else if (number == 0) {
			return 1;
		}
		return -1;
	}
}
