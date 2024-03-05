package JavaExercises;

public class SameASCII {

	public static void main(String[] args) {

		System.out.println(checkSumEquality2("EDABIT", "EDABIT"));
	}

	public static boolean checkSumEquality(String parameter1, String parameter2) {

		int a = 0;
		int b = 0;
		char array1[] = new char[parameter1.length()];
		char array2[] = new char[parameter2.length()];
		for (int i = 0; i < parameter1.length(); i++) {
			array1[i] = parameter1.charAt(i);
		}
		for (int j = 0; j < parameter2.length(); j++) {
			array2[j] = parameter2.charAt(j);
		}

		for (int k = 0; k < array2.length; k++) {
			b = b + array2[k];
		}
		for (int m = 0; m < array1.length; m++) {
			a = a + array1[m];
		}
		if (a == b) {
			return true;
		}
		return false;
	}

	public static boolean checkSumEquality2(String parameter1, String parameter2) {
		int ascii1 = 0;
		int ascii2 = 0;
		for (int i = 0; i < parameter1.length(); i++) {
			ascii1 = ascii1 + parameter1.charAt(i);
		}
		for (int j = 0; j < parameter2.length(); j++) {
			ascii2 = ascii2 + parameter2.charAt(j);
		}
		if (ascii1 == ascii2) {
			return true;
		}
		return false;
	}
}
