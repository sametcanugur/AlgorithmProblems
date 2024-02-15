package Sorular;

public class RecursionLengthofaString {

	public static void main(String[] args) {
		System.out.println(recursionFindLength("aaa"));
	}

	public static int recursionFindLength(String word) {
		if (word.length() > 0) {
			return 1 + word.length() - 1;
		}
		return word.length();
	}
}
