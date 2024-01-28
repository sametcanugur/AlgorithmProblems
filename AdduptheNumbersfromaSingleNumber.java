package Sorular;

public class AdduptheNumbersfromaSingleNumber {

	public static void main(String[] args) {
		System.out.println(addUpTheNumbersFromSingleNumber(4));
	}

	public static int addUpTheNumbersFromSingleNumber(int number) {
		int result = 0;
		if (number > 0 && number < 1001) {
			result = (number * (number + 1)) / 2;
		}
		return result;
	}
}
