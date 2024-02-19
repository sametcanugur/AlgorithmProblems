package JavaExercises;

public class CountInstancesofaCharacterinaString {

	public static void main(String[] args) {
		System.out.println(instanceCounter('s', "selam bro samatyali misin"));
	}

	public static int instanceCounter(char character, String sentence) {
		int count = 0;
		char array[] = sentence.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == character) {
				count++;
			}
		}
		return count;
	}
}
