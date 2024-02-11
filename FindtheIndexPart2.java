package Sorular;

public class FindtheIndexPart2 {

	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 7, 9 };
		System.out.println(findTheIndex(array, 11));
	}

	public static int findTheIndex(int[] array, int number) {

		int result = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				result = i;
				return result;
			}
		}
		return -1;
	}
}
