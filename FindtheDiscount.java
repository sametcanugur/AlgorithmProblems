package JavaExercises;

public class FindtheDiscount {

	public static void main(String[] args) {

		System.out.println(priceFinder(89, 20));
	}

	public static double priceFinder(double price, double discount) {

		double finalPrice = price - (price * (discount / 100));
		return finalPrice;
	}
}
