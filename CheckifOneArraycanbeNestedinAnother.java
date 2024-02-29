package JavaExercises;

public class CheckifOneArraycanbeNestedinAnother {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4 };
		int array2[] = { 2, 3 };
		System.out.println(checkNestedOrNot(array1, array2));
	}

	public static boolean checkNestedOrNot(int firstArray[], int secondArray[]) {

		int keeper = 0;
		int k = 0;
		for (int i = 0; i < firstArray.length; i++) {
			for (int j = k; j < firstArray.length; j++) {
				if (firstArray[i] < firstArray[j]) {
					keeper = firstArray[i];
					firstArray[i] = firstArray[j];
					firstArray[j] = keeper;
				}
			}
			k++;
		}
		int m = 0;
		for (int i = 0; i < secondArray.length; i++) {
			for (int j = m; j < secondArray.length; j++) {
				if (secondArray[i] < secondArray[j]) {
					keeper = secondArray[i];
					secondArray[i] = secondArray[j];
					secondArray[j] = keeper;
				}
			}
			m++;
		}
		if (firstArray[firstArray.length - 1] > secondArray[secondArray.length - 1] && firstArray[0] < secondArray[0]) {
			return true;
		}
		return false;
	}
}
