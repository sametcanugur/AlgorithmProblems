package Sorular;

public class VolumeofaBox {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4 };
		System.out.println(volumeCalculator(array));
	}

	public static int volumeCalculator(int array[]) {
		int volume = array[0] * array[1] * array[2];
		return volume;
	}
}
