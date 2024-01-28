package Sorular;

public class AmazingEdabit {

	public static void main(String[] args) {
		System.out.println(findingWord("Sedat is amazing"));
	}

	public static String findingWord(String sentence) {

		String answer = "";
		String trimSentence = "not amazing";
		String array[] = sentence.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("edabit")) {
				return sentence;
			}
			if (i < array.length - 1) {
				answer = answer + array[i] + " ";
			}
		}
		return answer + trimSentence;
	}
}