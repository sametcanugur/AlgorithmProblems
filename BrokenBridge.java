package Sorular;

public class BrokenBridge {

	public static void main(String[] args) {
		System.out.println(stringHasEmptyOrNot("#### ###"));
	}

	public static boolean stringHasEmptyOrNot(String bridge) {

		for (int i = 0; i < bridge.length(); i++) {
			if (bridge.charAt(i) == ' ') {
				return false;
			}
		}
		return true;
	}
}
