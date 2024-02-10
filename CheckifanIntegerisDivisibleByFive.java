package Sorular;

public class CheckifanIntegerisDivisibleByFive {

	public static void main(String[] args) {
		System.out.println(divisibility(21));
	}

	public static boolean divisibility(int number) {
		if (number % 5 == 0) {
			return true;
		}
		return false;
	}
}
