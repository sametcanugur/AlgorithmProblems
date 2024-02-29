package JavaExercises;

public class Equalityof3Values {

	public static void main(String[] args) {

		System.out.println(equalNumbersFinder(3, 4, 1));
	}

	public static int equalNumbersFinder(int number1, int number2, int number3) {

		int array[] = { number1, number2, number3 };
		int count = 1;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					count++;
				}
				if (count == 3) {
					return 3;
				}
			}
		}
		if (count == 1) {
			count--;
		}
		return count;
	}
}
