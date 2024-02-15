package Sorular;

public class MissingThirdAngle {

	public static void main(String[] args) {
		System.out.println(angle(15, 45));
	}

	public static String angle(int number1, int number2) {
		int number3 = 180 - (number1 + number2);

		if (number3 > 90 && number3 < 180) {
			return "obtuse";
		} else if (number3 == 90) {
			return "right";
		} else if (number3 < 90 && number3 > 0) {
			return "acute";
		}
		return "undefined";
	}
}
