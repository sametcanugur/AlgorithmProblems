package Sorular;

public class NthEvenNumber {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4 };
		System.out.println(arrayConvertor(array));
	}

	public static int[] arrayConvertor(int inputArray[]) {
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = i * 2;
		}
		return inputArray;
	}
}
