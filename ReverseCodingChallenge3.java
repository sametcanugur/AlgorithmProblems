package Sorular;

public class ReverseCodingChallenge3 {

	public static void main(String[] args) {
		int array[] = { 3, 11, 4, 5 };
		System.out.println(divisibleOrNot(array, 4));
	}

	public static int[] divisibleOrNot(int[] array, int number) {
		int resultarray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			resultarray[i] = array[i] % number;
		}
		return resultarray;
	}
}
