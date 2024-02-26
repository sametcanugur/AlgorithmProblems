package JavaExercises;

public class HappyBirthday {

	public static void main(String[] args) {
		System.out.println(stringCreator(65));
	}

	public static String stringCreator(int currentAge) {

		int givenAge = 0;
		int base = currentAge / 2;
		if (currentAge % 2 == 0) {
			givenAge = 20;
		} else {
			givenAge = 21;
		}
		return "Tesha is just " + givenAge + ",in base " + base + "!";
	}
}
