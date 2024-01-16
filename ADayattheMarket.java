package Sorular;

public class ADayattheMarket {

	public static void main(String[] args) {
		System.out.println(aDayAtTheMarket(3, 7, 2, 5));
	}

	public static String aDayAtTheMarket(int billMoney, int willSpace, int price, int size) {
		if ((billMoney / price) > (willSpace / size)) {
			return "Bill";
		} else if ((billMoney / price) < (willSpace / size)) {
			return "Will";
		} else {
			return "Tie";
		}//
	}
}
