package JavaExercises;

public class MultiDivision {

	public static void main(String[] args) {
		System.out.println(checkDivisibleOrNot(6, 3, 2));
	}

	public static boolean checkDivisibleOrNot(int a, int b, int c) {
		int sum = a;
		for (int i = 0; i < b; i++) {
			sum = sum + sum;
		}
		if (sum % c == 0) {
			return true;
		}
		return false;
	}
}
