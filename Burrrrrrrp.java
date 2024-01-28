package Sorular;

public class Burrrrrrrp {

	public static void main(String[] args) {
		System.out.println(burpCreator(3));
	}

	public static String burpCreator(int number) {

		String bu = "Bu";
		for (int i = 0; i < number; i++) {
			bu = bu + 'r';
		}
		return bu + 'p';
	}
}
