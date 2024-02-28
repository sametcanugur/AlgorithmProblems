package JavaExercises;

public class WhereisBob {

	public static void main(String[] args) {

		String array[] = { "Jimmy", "Layla", "Bob" };
		System.out.println(stringFinder(array, "Bob"));
	}

	public static int stringFinder(String array[], String bob) {

		for (int i = 0; i < array.length; i++) {
			if ("Bob".equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
}
