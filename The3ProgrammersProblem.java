package JavaExercises;

public class The3ProgrammersProblem {

	public static void main(String[] args) {

		System.out.println(differenceFinder(147, 33, 526));
	}

	public static int differenceFinder(int number1, int number2, int number3) {

		int array[] = { number1, number2, number3 };
		int k = 0;
		int m = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = m; j < array.length; j++) {
				if (array[i] <= array[j]) {
					k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
			m++;
		}
		return array[0] - array[array.length - 1];
	}
}
