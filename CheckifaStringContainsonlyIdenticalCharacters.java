package JavaExercises;

public class CheckifaStringContainsonlyIdenticalCharacters {

	public static void main(String[] args) {
		System.out.println(checkIdenticalOrNot("cccccc"));

	}

	public static boolean checkIdenticalOrNot(String text) {
		char array[] = text.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
			}
		}
		if (array.length > 1 && count == array.length - 1) {
			return true;
		}
		return false;
	}
}
