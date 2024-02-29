package JavaExercises;

public class Findthebomb {

	public static void main(String[] args) {

		System.out.println(wordChecker("Hey, did you think there is a BoMB?"));
	}

	public static String wordChecker(String sentence) {

		String sentenceUpdated = sentence.toUpperCase();
		String array[] = sentenceUpdated.split("");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("B") && array[i + 1].equals("O") && array[i + 2].equals("M")
					&& array[i + 3].equals("B")) {
				count++;
			}
		}
		if (count > 0) {
			return "DUCK!";
		}
		return "Relax, there's no bomb.";
	}
}
