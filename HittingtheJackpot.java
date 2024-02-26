package JavaExercises;

public class HittingtheJackpot {

	public static void main(String[] args) {
		String array[] = { "abc", "abc", "abc", "abc" };
		System.out.println(checkIdentical(array));
	}

	public static boolean checkIdentical(String array[]) {
		for (int i = 0; i < 1; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count == array.length) {
				return true;
			}
		}
		return false;
	}
}
