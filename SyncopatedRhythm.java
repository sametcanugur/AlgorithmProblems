package JavaExercises;

public class SyncopatedRhythm {

	public static void main(String[] args) {
		System.out.println(syncopationFinder("#.#.###."));
	}

	public static boolean syncopationFinder(String text) {
		char array[] = text.toCharArray();
		for (int i = 0; i < array.length; i = i + 2) {
			if (array[i + 1] == '#') {
				return true;
			}
		}
		return false;
	}
}
