package JavaExercises;

public class AlgebraSequenceBoxes {

	public static void main(String[] args) {

		System.out.println(boxCountCalculator(6));
	}

	public static int boxCountCalculator(int number) {

		int box = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				box = box + 3;
			} else {
				box = box - 1;
			}
		}
		return box;
	}
}
