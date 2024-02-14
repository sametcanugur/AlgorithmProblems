package Sorular;

public class IstheWordSingularorPlural {

	public static void main(String[] args) {
		System.out.println(findSingularOrPlural("selams"));
	}

	public static boolean findSingularOrPlural(String text) {
		char[] array1 = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			array1 = text.toCharArray();
		}
		if (array1[text.length() - 1] == 's') {
			return true;
		}
		return false;
	}
}
