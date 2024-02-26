package JavaExercises;

public class FindtheLargestNumberinanArray {

	public static void main(String[] args) {
		int array[] = { 4, 5, 1, 3 };
		System.out.println(largestnumberFinder(array));

	}

	public static int largestnumberFinder(int array[]) {

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] >= array[j]) {
					count++;
				}
				if (array[i] >= array[j] && count == array.length) {
					return array[i];
				}
			}
		}
		return -1;
	}
}
