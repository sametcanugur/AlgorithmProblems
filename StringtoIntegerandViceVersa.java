package Sorular;

public class StringtoIntegerandViceVersa {

	public static void main(String[] args) {
		System.out.println(toInt("222"));
		System.out.println(toStr(555));
	}

	public static int toInt(String number2) {
		int numeric = Integer.parseInt(number2);
		return numeric;
	}

	public static String toStr(int number) {
		String text = String.valueOf(number);
		return text;
	}
}
