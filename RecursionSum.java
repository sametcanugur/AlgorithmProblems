package Sorular;

public class RecursionSum {

	public static void main(String[] args) {
		System.out.println(recursionSum(5));
	}

	public static int recursionSum(int number) {
		if (number > 0) {
			return number + recursionSum(number - 1);
			}
		return 0;
	}
}
