package Sorular;

public class OwofiedaSentence {

	public static void main(String[] args) {
		System.out.println(owoFiedaSentence("selam iyi"));
	}

	public static String owoFiedaSentence(String sentence) {
		String sentence2 = sentence.replaceAll("i", "wi");
		String sentence3 = sentence2.replaceAll("e", "we");
		return sentence3 + " owo";
	}
}
