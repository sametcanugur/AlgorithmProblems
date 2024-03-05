package JavaExercises;

public class PhoneNumberFormatting {

	public static void main(String[] args) {

		int array[] = { 5, 1, 9, 5, 5, 5, 4, 4, 6, 8 };
		System.out.println(phoneNumberMaker(array));
	}

	public static String phoneNumberMaker(int mainArray[]) {

		String resultArray[] = new String[mainArray.length];
		String array1[] = new String[3];
		String array2[] = new String[3];
		String array3[] = new String[4];

		for (int i = 0; i < mainArray.length; i++) {
			resultArray[i] = Integer.toString(mainArray[i]);
		}
		String x = "";
		String y = "";
		String z = "";
		int k = 0;
		int m = 0;

		for (int j = 0; j < resultArray.length; j++) {
			if (j < 3) {
				array1[j] = resultArray[j];
				x = x + array1[j];
			}
			if (j >= 3 && j < 6) {
				array2[k] = resultArray[j];
				y = y + array2[k];
				k++;
			}
			if (j > 5 && j < mainArray.length) {
				array3[m] = resultArray[j];
				z = z + array3[m];
				m++;
			}
		}
		return "(" + x + ")" + " " + y + "-" + z;
	}
}
