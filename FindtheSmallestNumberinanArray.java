package JavaExercises;

public class FindtheSmallestNumberinanArray {

	public static void main(String[] args) {

		int array[] = { 34, 15, 88, 2 };
		System.out.println(smallestNumberFinder(array));
	}

	public static int smallestNumberFinder(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] <= array[j]) {
					count++;
				}
			}
			if (count == array.length) {
				return array[i];
			}
		}
		return -1;
	}
}
