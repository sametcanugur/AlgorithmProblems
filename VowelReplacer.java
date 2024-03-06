package JavaExercises;

public class VowelReplacer {

	public static void main(String[] args) {

		System.out.println(vowelReplacer("the aardvark", "#"));
	}

	public static String vowelReplacer(String text1, String text2) {
		String[] convertedArray = text1.split("");
		String[] vowelArray = { "a", "e", "i", "o", "u" };
		String result = "";

		for (int i = 0; i < convertedArray.length; i++) {
			boolean check = false;
			for (int j = 0; j < vowelArray.length; j++) {
				if (convertedArray[i].equals(vowelArray[j])) {
					check = true;
					result = result + text2;
					break;
				} else {
					check = false;
				}
			}
			if (check == false) {
				result = result + convertedArray[i];
			}
		}
		return result;
	}
}
