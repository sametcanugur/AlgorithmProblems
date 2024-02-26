package JavaExercises;

public class FindtheIndexPart1 {

	public static void main(String[] args) {
		int array[] = { 1, 5, 3 };
		System.out.println(indexFinder(array, 3));
	}

	public static int indexFinder(int array[], int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}
}
