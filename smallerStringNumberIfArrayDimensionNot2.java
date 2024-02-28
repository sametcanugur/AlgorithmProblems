package JavaExercises;

public class smallerStringNumberIfArrayDimensionNot2 {

	public static void main(String[] args) {

		int array[] = { 4, 6, 3, 2 };
		System.out.println(smallNumberFinder(array));
	}

	public static int smallNumberFinder(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int count=0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					count++;
				}
				if (count == array.length - 1) {
					return array[i];
				}
			}

		}
		return -1;
	}

}
