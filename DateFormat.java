package JavaExercises;

public class DateFormat {

	public static void main(String[] args) {
		String text = "11/12/2019";
		System.out.println(dateConvertor(text));
	}

	public static String dateConvertor(String date) {

		char convertedArray[] = date.toCharArray();
		char resultArray[] = new char[date.length() - 2];
		int m = 0;
		int n = 4;
		int s = 6;

		for (int i = 6; i < 10; i++) {
			resultArray[m] = convertedArray[i];
			m++;
		}
		for (int j = 3; j < 5; j++) {
			resultArray[n] = convertedArray[j];
			n++;
		}
		for (int k = 0; k < 2; k++) {
			resultArray[s] = convertedArray[k];
			s++;
		}
		String string = String.valueOf(resultArray);
		return string;
	}
}
