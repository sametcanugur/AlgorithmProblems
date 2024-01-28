package Sorular;

public class AddaConsecutiveListofNumbers {

	public static void main(String[] args) {
		System.out.println(addConsecutiveListOfNumbers(10));
	}

	public static int addConsecutiveListOfNumbers(int number) {

		int count = 0;
		for (int i = number; i > 0; i--) {
			count = count + i;
		}
		return count;
	}
}