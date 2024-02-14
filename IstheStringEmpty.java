package Sorular;

public class IstheStringEmpty {

	public static void main(String[] args) {
		System.out.println(checkSpace(""));
	}

	public static boolean checkSpace(String text) {
		if (text.equals("")) {
			return true;
		}
		return false;
	}
}
