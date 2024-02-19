package JavaExercises;

public class EqualityCheck {

	public static void main(String[] args) {
		System.out.println(checkParametersType(3, 3));
	}

	public static boolean checkParametersType(Object number, Object text) {
		if (number == null || text == null) {
			return false;
		}
		return text.equals(number);
	}
}
