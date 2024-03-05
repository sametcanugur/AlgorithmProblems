package JavaExercises;

public class RepeatingLettersNTimes {

	public static void main(String[] args) {

		System.out.println(wordCreator("mice", 5));
	}

	public static String wordCreator(String word, int number) {
		String[] convertedArray = word.split("");
		String result = "";
		for (int i = 0; i < convertedArray.length; i++) {
			for (int j = 0; j < number; j++) {
				result = result + convertedArray[i];
			}
		}
		return result;
	}
}
