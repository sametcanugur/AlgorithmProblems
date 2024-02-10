package Sorular;

public class CompareStringsbyCountofCharacters {

	public static void main(String[] args) {
		System.out.println(lengthCheck("sedo", "meno"));
	}

	public static boolean lengthCheck(String name1, String name2) {
		if (name1.length() == name2.length()) {
			return true;
		}
		return false;
	}
}