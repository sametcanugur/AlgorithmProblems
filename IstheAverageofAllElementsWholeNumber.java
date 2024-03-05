package JavaExercises;

public class IstheAverageofAllElementsWholeNumber {

	public static void main(String[] args) {

		int array[] = { 3, 3, 3, 3 };
		System.out.println(checkWholeOrNot(array));
	}

	public static boolean checkWholeOrNot(int array[]) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		if (sum % array.length == 0) {
			return true;
		}
		return false;
	}
}
