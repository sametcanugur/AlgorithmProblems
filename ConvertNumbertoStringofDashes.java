package Sorular;

public class ConvertNumbertoStringofDashes {

	public static void main(String[] args) {
		System.out.println(convertNumberToStringOfDashes(61));
	}

	public static String convertNumberToStringOfDashes(int number) {
		String character = "";
		for (int i = 0; i < number; i++) {
			if (number >= 1 && number <= 60) {
				character = character + "-";
			} else {
				return "invalid number";
			}
		}
		return character;
	}
}
