package Sorular;

public class LetsFuelUp {

	public static void main(String[] args) {
		System.out.println(calculateFuel(5));
	}

	public static int calculateFuel(int distance) {
		int fuel = distance * 10;
		if (fuel >= 100) {
			return fuel;
		}
		return 100;
	}
}
