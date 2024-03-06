package JavaExercises;

public class StutteringFunction {

	public static void main(String[] args) {

		System.out.println(stutteredWord("incredible?"));
	}

	public static String stutteredWord(String text) {

		String trimmed = text.substring(0, 2);
		return trimmed + "... " + trimmed + "... " + text;
	}
}
