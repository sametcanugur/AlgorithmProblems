package Sorular;

public class MovieTheatreAdmittance {

	public static void main(String[] args) {
		System.out.println(check(true, 14));
	}

	public static boolean check(boolean isSupervisor, int age) {
		if (age < 15) {
			if (isSupervisor == true) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
}
