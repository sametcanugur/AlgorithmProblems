package JavaExercises;

public class BacktoHome {

	public static void main(String[] args) {
		System.out.println(checkDirections("NEESSWWN"));
	}

	public static boolean checkDirections(String direction) {

		int countS = 0;
		int countN = 0;
		int countE = 0;
		int countW = 0;

		for (int i = 0; i < direction.length(); i++) {
			if (direction.charAt(i) == 'S') {
				countS++;
			} else if (direction.charAt(i) == 'N') {
				countN++;
			} else if (direction.charAt(i) == 'E') {
				countE++;
			} else if (direction.charAt(i) == 'W') {
				countW++;
			}
		}
		if (countS == countN && countE == countW) {
			return true;
		}
		return false;
	}
}
