package JavaExercises;

public class GiveMetheEvenNumbers {

	public static void main(String[] args) {
		System.out.println(sumOfTheNumbersInRange(63, 97));
	}

	public static int sumOfTheNumbersInRange(int lowNumber, int highNumber) {
		int sum = 0;
		for (int i = lowNumber; i <= highNumber; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
