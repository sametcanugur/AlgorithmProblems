package Sorular;

public class ReturntheFirstandLastElementsinanArray {

	public static void main(String[] args) {
		String[] myarray = { "edabit", "13", "selam", "true", "naber", "iyiyim" };
		System.out.println(returnFirstAndLastElementsInArray(myarray));
	}

	public static String[] returnFirstAndLastElementsInArray(String array[]) {
		String[] finalArray = { array[0], array[array.length - 1] };
		return finalArray;
	}
}
