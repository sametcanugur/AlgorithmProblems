package Sorular;

public class Multipleof100 {

	public static void main(String[] args) {
		System.out.println(divisibleCheck(200));
	}

	public static boolean divisibleCheck(int number) {
		if (number % 100 == 0) {
			return true;
		}
		return false;
	}
}
