package Sorular;

public class SnailGoesUptheStairs {

	public static void main(String[] args) {
		System.out.println(distanceCalculator(0.2, 0.4, 100.0));
	}

	public static double distanceCalculator(double number1, double number2, double number3) {

		double totaldistance = (number3 / number1) * number2 + number3;
		return totaldistance;
	}
}
