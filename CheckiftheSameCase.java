package JavaExercises;

public class CheckiftheSameCase {

	public static void main(String[] args) {
		System.out.println(CheckingUpperLower("ketcHUp"));
	}

	public static boolean CheckingUpperLower(String text) {

		int count = 0;
		int sum = 0;
		String lower = text.toLowerCase();
		String upper = text.toUpperCase();

		char convertedArray[] = text.toCharArray();
		char lowerArray[] = lower.toCharArray();
		char upperArray[] = upper.toCharArray();

		if (convertedArray[0] == lowerArray[0]) {
			count = 0;
		} else {
			count = 1;
		}
		for (int i = 0; i < convertedArray.length; i++) {
			if (count == 0 && convertedArray[i] == lowerArray[i]) {
				sum++;
			} else if (count == 1 && convertedArray[i] == upperArray[i]) {
				sum++;
			}
		}
		if (sum >= convertedArray.length) {
			return true;
		}
		return false;
	}
}
