package Sorular;

public class TothePowerof {

	public static void main(String[] args) {
		System.out.println(thePowerOf(9, 3));
	}

	public static int thePowerOf(int number1, int number2) {
		int power = 1;
		for (int i = 0; i < number2; i++) {
			power = power * number1;
		}
		return power;
	}
}
