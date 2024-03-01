package JavaExercises;

public class FinishTheSentenceYoureOn {

	public static void main(String[] args) {

		System.out.println(unfinishedSentencesWordsCount("And so brings my conclusion to its conclusion.",
				"And so brings my conclusion to its conclus"));
	}

	public static int unfinishedSentencesWordsCount(String sentence, String halfSentence) {

		String sentenceArray[] = sentence.split("");
		String halfArray[] = halfSentence.split("");
		String resultArray[] = new String[sentenceArray.length - halfArray.length];
		int halfArrayLength = halfArray.length;
		int count = 0;

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = sentenceArray[halfArrayLength];
			halfArrayLength++;
		}
		for (int j = 0; j < resultArray.length; j++) {
			if (resultArray[j].equals(" ")) {
				count++;
			}
		}
		String result = String.join("", resultArray);
		return ((result.length() - count) * 1 / 2);
	}

	public static int unfinishedSentencesWordsCount2(String sentence, String halfSentence) {
		String[] longSentence = sentence.split(" ");
		String[] shortSentence = halfSentence.split(" ");
		String result = "";

		for (int i = 0; i < longSentence.length; i++) {
			for (int j = 0; j < shortSentence.length; j++) {
				if (!longSentence[i].equals(shortSentence[j])) {
					result = result + " " + longSentence[i];
				}
			}
		}
		return result.split(" ").length * 1 / 2;
	}
}
