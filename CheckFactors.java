package Sorular;

public class CheckFactors {

	public static void main(String[] args) {
		int array[] = { 2, 5, 10 };
		System.out.println(checkFactors(10, array));
	}

	public static boolean checkFactors(int number, int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (number % array[i] == 0) {
				count++;
			}
		}
		if(count==array.length) {
			return true;
		}
		return false;
	}
}
