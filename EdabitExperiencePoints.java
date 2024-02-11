package Sorular;

public class EdabitExperiencePoints {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 5, 6 };
		System.out.println(xpCalculator(array));
	}

	public static int xpCalculator(int[] array) {
		int sum = 0;
		int holder = 0;
		int multiplier = 5;

		if (array.length != 5) {
			return 0;
		}
		if (array.length == 5) {
			for (int i = 0; i < array.length; i++) {
				holder = array[i] * multiplier;
				multiplier = multiplier * 2;
				sum = sum + holder;
			}
		}
		return sum;
	}
}
