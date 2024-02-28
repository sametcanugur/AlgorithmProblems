package JavaExercises;

public class RepeatString {

	public static void main(String[] args) {
		System.out.println(repeater("Tesha", 3));

	}

	public static String repeater(Object t, int n) {

		if (t instanceof String) {
			String text = "";
			for (int i = 0; i < n; i++) {
				text = text + t;
			}
			return text;
		}
		return "Not a string!";
	}
}
