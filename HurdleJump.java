package Sorular;

public class HurdleJump {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };
		System.out.println(hurdleJump(array, 0));
	}

	public static boolean hurdleJump(int[] array, int height) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (height >= array[i]) {
				count++;
			}
		}
		if (count == array.length || count == 0) {
			return true;
		}
		return false;
	}
}
