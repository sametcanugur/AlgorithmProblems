package JavaExercises;

public class HashesandPluses {

	public static void main(String[] args) {

		System.out.println(stringCounter("#+++#+#++#"));
	}

	public static int[] stringCounter(String text) {

		int hash = 0;
		int plus = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '#') {
				hash++;
			}
			if (text.charAt(i) == '+') {
				plus++;
			}
		}
		int array[] = { hash, plus };
		return array;
	}
}
