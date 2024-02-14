package Sorular;

public class MakeMyWayHome {

	public static void main(String[] args) {
		int array[] = { 3, 4, 3 };
		System.out.println(calculateDistance(array));
	}

	public static int calculateDistance(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		if (result >= 0) {
			return result;
		} else {
			return 0 - result;
		}
	}
}
