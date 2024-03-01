package JavaExercises;

public class HowMuchisTrue {

	public static void main(String[] args) {

		boolean array[] = { true, false, false, true, false };
		System.out.println(finderBoolean(array));
	}

	public static int finderBoolean(boolean array[]) {

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				count++;
			}
		}
		return count;
	}
}
