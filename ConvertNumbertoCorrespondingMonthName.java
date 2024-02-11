package Sorular;

public class ConvertNumbertoCorrespondingMonthName {

	public static void main(String[] args) {
		System.out.println(convertNumberToCorrespondingMonth(1));
	}

	public static String convertNumberToCorrespondingMonth(int number) {
		String array2[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 0; i < array2.length + 1; i++) {
			if (number == i) {
				return array2[i - 1];
			}
		}
		return "";
	}
}