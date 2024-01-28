package Sorular;

public class BuggyCodePart5 {

	public static void main(String[] args) {
		int firstArray[] = { 2, 3, 4 };
		arrayConvertor(firstArray);
	}

	public static int[] arrayConvertor(int firstArray[]) {
		int resultArray[] = new int[firstArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			if (i % 2 == 0) {
				resultArray[i] = i + 1;
			} else {
				resultArray[i] = i * 2;
			}
		}
		return resultArray;
	}
}