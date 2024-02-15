package Sorular;

public class OddUpEvenDown {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		oddUpEvenDown(array);
	}

	public static int[] oddUpEvenDown(int[] array) {
		int resultarray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				resultarray[i] = array[i] - 1;
			} else {
				resultarray[i] = array[i] + 1;
			}
		}
		return resultarray;
	}
}
