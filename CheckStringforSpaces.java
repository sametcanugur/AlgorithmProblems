package Sorular;

public class CheckStringforSpaces {

	public static void main(String[] args) {
		System.out.println(checkAnySpace("hi bro"));
	}

	public static boolean checkAnySpace(String sentence) {
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == (' ')) {
				return true;
			}
		}
		return false;
	}
}
