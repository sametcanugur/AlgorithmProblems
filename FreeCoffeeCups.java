package Sorular;

public class FreeCoffeeCups {

	public static void main(String[] args) {
		System.out.println(calculateTotalFreeCup(30));
	}

	public static int calculateTotalFreeCup(int cupcount) {
		int totalcup = 0;
		if (cupcount % 6 == 0) {
			totalcup = (7 * cupcount) / 6;
			return totalcup;
		} else {
			totalcup = cupcount;
			return totalcup;
		}
	}
}
