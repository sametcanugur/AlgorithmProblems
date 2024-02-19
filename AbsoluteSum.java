package JavaExercises;

public class AbsoluteSum {

	public static void main(String[] args) {
		int array[] = { 2, -1, 4, 8, 10 };
		System.out.println(sumOfArray(array));
	}

	public static int sumOfArray(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = array[i] * -1;
			}
			sum = sum + array[i];
		}
		return sum;
	}
}
