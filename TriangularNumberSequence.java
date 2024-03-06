package JavaExercises;

public class TriangularNumberSequence {

	public static void main(String[] args) {

		System.out.println(dotFinder(215));
	}

	public static int dotFinder(int input) {

		int result = 0;
		for (int i = 1; i <= input; i++) {
			result = result + i;
		}
		return result;
	}
}
