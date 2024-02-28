package JavaExercises;

public class RotateMaxNumber {

	public static void main(String[] args) {

		System.out.println(numberSorter("3213242"));
	}

	public static int numberSorter(String number) {

		char array[] = number.toCharArray();
		char resultArray[] = new char[array.length];

		char k = 0;
		int m = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = m; j < array.length; j++) {
				if (array[i] <= array[j]) {
					resultArray[i] = array[j];
					k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
			m++;
		}
		String convertedToString = String.valueOf(array);
		int result = Integer.valueOf(convertedToString);
		return result;
	}
}
