package JavaExercises;

public class PrefixesvsSuffixes {

	public static void main(String[] args) {

		System.out.println(checkPrefix("", ""));
		System.out.println(checkSuffix("ancxjsn", null));
	}

	public static boolean checkPrefix(String text1, String prefix) {
		if (text1 == null || prefix == null) {
			return false;
		}

		String result = "";
		for (int i = 0; i < prefix.length() - 1; i++) {
			result = result + text1.charAt(i);
		}

		if ((result + "-").equals(prefix)) {
			return true;
		}
		return false;
	}

	public static boolean checkSuffix(String text2, String suffix) {
		if (text2 == null || suffix == null) {
			return false;
		}

		String reverseSuffix = "";
		for (int i = suffix.length() - 1; i >= 0; i--) {
			reverseSuffix = suffix.charAt(i) + reverseSuffix;
		}

		if ((suffix).equals(reverseSuffix)) {
			return true;
		}
		return false;
	}
}