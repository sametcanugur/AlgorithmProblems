package JavaExercises;

public class LastDigitUltimate {

	public static void main(String[] args) {

		System.out.println(checkLastDigit(55, 226, 5190));
	}

	public static boolean checkLastDigit(int a, int b, int c) {
		String textA = Integer.toString(a);
		String textB = Integer.toString(b);
		String textC = Integer.toString(c);

		char characterA = textA.charAt(textA.length() - 1);
		char characterB = textB.charAt(textB.length() - 1);
		char characterC = textC.charAt(textC.length() - 1);

		int resultA = Integer.parseInt(String.valueOf(characterA));
		int resultB = Integer.parseInt(String.valueOf(characterB));

		String lastDigitAxB = Integer.toString(resultA * resultB);
		char digitAxB = lastDigitAxB.charAt(lastDigitAxB.length() - 1);

		if (digitAxB == characterC) {
			return true;
		}
		return false;
	}
}
