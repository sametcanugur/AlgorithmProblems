package JavaExercises;

public class SpacesBetweenEachCharacter {

	public static void main(String[] args) {

		System.out.println(spacedWordCreater("hello"));
	}

	public static String spacedWordCreater(String word) {
		if (word.length() == 0) {
			return "";
		}
		int counter = 0;
		String[] convertedArray = word.split("");
		String[] resultArray = new String[word.length() * 2 - 1];
		String result = "";

		for (int i = 0; i < resultArray.length; i++) {
			if (i % 2 == 0) {
				resultArray[i] = convertedArray[counter];
				counter++;
			} else {
				resultArray[i] = " ";
			}
		}
		for (int j = 0; j < resultArray.length; j++) {
			result = result + resultArray[j];
		}
		return result;
	}
}
