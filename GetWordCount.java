package JavaExercises;

public class GetWordCount {

	public static void main(String[] args) {

		System.out.println(wordCounter("What an easy task, right"));
	}

	public static int wordCounter(String text) {

		String[] stringArray = new String[] { text };
		String resultArray[] = new String[stringArray.length];
		resultArray = text.split(" ");

		return resultArray.length;
	}
}
