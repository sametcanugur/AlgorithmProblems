package JavaExercises;

public class FixtheSpacing {

	public static void main(String[] args) {
		System.out.println(sentenceFixer(" Always look on    the bright   side of  life."));
	}

	public static String sentenceFixer(String sentence) {
		int counter = 0;
		String result = "";
		String[] convertedArray = sentence.split("");

		for (int j = 0; j < convertedArray.length; j++) {
			if (convertedArray[j].equals(" ")) {
				counter++;
			} else {
				break;
			}
		}
		for (int i = 0; i < convertedArray.length; i++) {
			if (!convertedArray[i].equals(" ")) {
				result = result + convertedArray[i];
			} else if (convertedArray[i].equals(" ") && i == convertedArray.length - 1) {
				break;
			} else if (convertedArray[i].equals(" ") && !convertedArray[i + 1].equals(" ") && i > counter
					&& i >= counter) {
				result = result + " ";
			}
		}
		return result;
	}
}
