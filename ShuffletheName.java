package JavaExercises;

public class ShuffletheName {

	public static void main(String[] args) {

		System.out.println(reverseString("Rosie O'Donnell"));
	}

	public static String reverseString(String text) {

		String array[] = text.split(" ");
		String reverseArray[] = new String[array.length];
		int k = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			reverseArray[i] = array[k];
			k--;
		}
		String arrayToString = String.join(" ", reverseArray);
		return arrayToString;
	}
}
 