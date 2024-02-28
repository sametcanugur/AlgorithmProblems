package JavaExercises;

public class MinimumRemovalstoMakeSumEven {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		System.out.println(evenMaker(array));
	}

	public static int evenMaker(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		if (sum % 2 == 0) {
			return 0;
		}
		return 1;
	}
}
