package Sorular;

public class CaseInsensitiveComparison {

	public static void main(String[] args) {
		System.out.println(stringsEqualsOrNot2("hello", "hello"));
	}

	public static boolean stringsEqualsOrNot(String word1, String word2) {
		if (word1.equalsIgnoreCase(word2)) {
			return true;
		}
		return false;
	}

	public static boolean stringsEqualsOrNot2(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		int count = 0;
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
				count++;
				if (count == word1.length()) {
					return true;
				}
			}
		}
		return false;
	}
}
