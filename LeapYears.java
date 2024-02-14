package Sorular;

public class LeapYears {

	public static void main(String[] args) {
		System.out.println(leapYearOrNot(96));
	}

	public static boolean leapYearOrNot(int number) {
		if ((number % 400 == 0 || number % 4 == 0) && number % 100 != 0) {
			return true;
		}
		return false;
	}
}
