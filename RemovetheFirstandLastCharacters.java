package Sorular;

public class RemovetheFirstandLastCharacters {
	public static void main(String[] args) {
		System.out.println(removeFirstandLastCharacters("selam"));
	}

	public static String removeFirstandLastCharacters(String text) {
		if (text.length() < 3) {
			return text;
		}

		char convertedArray[] = text.toCharArray();
		char resultArray[] = new char[convertedArray.length - 2];
		int j = convertedArray.length - 1;
		int k = 0;

		for (int i = 1; i < convertedArray.length; i++) {
			if (i != j) {
				resultArray[k] = convertedArray[i];
				k++;
			}
		}

		String result = "";
		for (int i = 0; i < resultArray.length; i++) {
			result = result + resultArray[i];
		}
		return result;
	}
}
