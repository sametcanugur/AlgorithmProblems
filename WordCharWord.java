package Sorular;

public class WordCharWord {

	public static void main(String[] args) {
		System.out.println(sentenceReplacement("Hello", "World be"));
	}

	public static String sentenceReplacement(String sentence1, String sentence2) {
		String result = sentence2.replace(" ", sentence1);
		return result;
	}
}
