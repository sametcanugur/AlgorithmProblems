package JavaExercises;

public class CapturetheRook {

	public static void main(String[] args) {

		String array[] = { "H4", "H3" };
		System.out.println(checkStrings(array));
	}

	public static boolean checkStrings(String array[]) {

		char charArray1[] = array[0].toCharArray();
		char charArray2[] = array[1].toCharArray();

		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] == charArray2[i]) {
				return true;
			}
		}
		return false;
	}
}
