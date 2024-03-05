package JavaExercises;

public class SayHelloSayBye {

	public static void main(String[] args) {

		System.out.println(stringCreator("tomi", 0));
	}

	public static String stringCreator(String name, int number) {

		String updatedName = name.substring(1);
		char firstLetter = name.charAt(0);
		String convertedFirstLetter = String.valueOf(firstLetter);
		String firstLetterChanged = convertedFirstLetter.toUpperCase();
		String resultName = firstLetterChanged + updatedName;

		if (number == 1) {
			return "Hello " + resultName;
		}
		return "Bye " + resultName;
	}
}
