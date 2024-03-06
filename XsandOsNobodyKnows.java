package JavaExercises;

public class XsandOsNobodyKnows {

	public static void main(String[] args) {

		System.out.println(xAndOCounter("ooxXm"));
	}

	public static boolean xAndOCounter(String text) {

		int oCounter = 0;
		int xCounter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'o' || text.charAt(i) == 'O') {
				oCounter++;
			}
			if (text.charAt(i) == 'x' || text.charAt(i) == 'X') {
				xCounter++;
			}
		}
		if (oCounter == xCounter) {
			return true;
		}
		return false;
	}
}
