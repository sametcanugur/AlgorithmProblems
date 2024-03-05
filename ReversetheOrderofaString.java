package JavaExercises;

public class ReversetheOrderofaString {

	public static void main(String[] args) {

		System.out.println(reversedString("Hello World"));
	}

	public static String reversedString(String text) {

		char firstArray[] = text.toCharArray();
		char convertedArray[] = new char[firstArray.length];
		int k = 0;
		for (int i = firstArray.length - 1; i >= 0; i--) {
			convertedArray[k] = firstArray[i];
			k++;
		}
		return String.valueOf(convertedArray);
	}
}
