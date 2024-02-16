package Sorular;

public class SimilarBread {

	public static void main(String[] args) {
		String firstArray[] = { "white bread", "lettuce", "brown bread" };
		String secondArray[] = { "white bread", "tomato", "brown bread" };
		System.out.println(checkSimilarOrNot(firstArray, secondArray));
	}

	public static boolean checkSimilarOrNot(String firstArray[], String secondArray[]) {

		if (firstArray[0] == secondArray[0]
				&& firstArray[firstArray.length - 1] == secondArray[secondArray.length - 1]) {
			return true;
		}
		return false;
	}
}