package Sorular;

public class FliptheBoolean {

	public static void main(String[] args) {

		System.out.println(stringToBoolean("true"));
	}

	public static boolean stringToBoolean(String check) {
		if (check == "true") {
			return false;
		}
		return true;
	}
}