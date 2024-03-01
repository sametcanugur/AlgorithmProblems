package JavaExercises;

public class GettheFileName {

	public static void main(String[] args) {

		System.out.println(pathFinder("C:/Projects/pil_tests/ascii/edabit.txt"));
	}

	public static String pathFinder(String text) {

		String array[] = text.split("/");
		return array[array.length - 1];
	}
}
