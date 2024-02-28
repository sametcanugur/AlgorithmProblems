package JavaExercises;

public class SmallerStringNumber {

	public static void main(String[] args) {
		String array[] = { "3", "4" };
		System.out.println(smallNumberFinder(array));

	}

	public static String smallNumberFinder(String array[]) {
		if (Integer.parseInt(array[1]) > Integer.parseInt(array[0])) {
			return array[0];
		}
		return array[1];
	}
}
