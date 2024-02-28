package JavaExercises;

public class ShapesWithNSides {

	public static void main(String[] args) {

		System.out.println(shapeFinder(10));
	}

	public static String shapeFinder(int number) {

		String array[] = { "circle", "semi-circle", "triangle", "square", "pentagon", "hexagon", "heptagon", "octagon",
				"nonagon", "decagon" };

		String result = array[number - 1];
		return result;
	}
}
