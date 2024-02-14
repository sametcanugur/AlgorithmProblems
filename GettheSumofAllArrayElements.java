package Sorular;

public class GettheSumofAllArrayElements {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4 };
		System.out.println(sum(array));
	}

	public static int sum(int firstArray[]) {
		int sum = 0;
		for (int i = 0; i < firstArray.length; i++) {
			sum = sum + firstArray[i];
		}
		return sum;
	}
}
