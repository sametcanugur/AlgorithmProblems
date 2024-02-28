package JavaExercises;

public class MatchstickHouses {

	public static void main(String[] args) {

		System.out.println(matchsticksCalculater(87));
	}

	public static int matchsticksCalculater(int step) {

		int count = 1;
		for (int i = 0; i < step; i++) {
			count = count + 5;
		}
		return count;
	}
}
