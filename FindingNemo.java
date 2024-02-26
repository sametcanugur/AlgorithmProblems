package JavaExercises;

public class FindingNemo {

	public static void main(String[] args) {

		System.out.println(nemoFinder("Nemo is me"));
	}

	public static String nemoFinder(String text) {

		String array[] = text.split(" ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("Nemo")) {
				return "I found Nemo at " + (i + 1) + "!";
			}
		}
		return "I can't find Nemo :(";
	}
}
