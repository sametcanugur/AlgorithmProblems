package JavaExercises;

public class MaximumDifference {

	public static void main(String[] args) {
		int array[] = { 10, 2, 20, 3, 40, 2 };
		System.out.println(maxDifferenceFinder(array));
	}

	public static int maxDifferenceFinder(int array[]) {
		int smallNumber = 0;
		int bigNumber = 0;

		for (int i = 0; i < array.length; i++) {
			int countBig = 0;
			int countSmall = 0;

			for (int j = 0; j < array.length; j++) {
				if (array[i] <= array[j]) {
					countSmall++;
				}
				if (array[i] >= array[j]) {
					countBig++;
				}
			}
			if (countSmall >= array.length - 1) {
				smallNumber = array[i];
			}
			if (countBig >= array.length - 1) {
				bigNumber = array[i];
			}
		}
		return bigNumber - smallNumber;
	}
}
