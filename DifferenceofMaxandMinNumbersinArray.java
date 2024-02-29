package JavaExercises;

public class DifferenceofMaxandMinNumbersinArray {

	public static void main(String[] args) {

		int array[] = { 10, 4, 1, 4, -10, -50, 32, 21 };
		System.out.println(differenceFinder(array));
	}

	public static int differenceFinder(int array[]) {

		int smallest = array[0];
		int biggest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallest >= array[i]) {
				smallest = array[i];
			}
			if (biggest <= array[i]) {
				biggest = array[i];
			}
		}
		return biggest - smallest;
	}
}
