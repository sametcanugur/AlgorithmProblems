package JavaExercises;

public class BitwiseOperations {

	public static void main(String[] args) {
		System.out.println(bitwiseCalculator(7,12));
	}

	public static double bitwiseCalculator(int parameter1, int parameter2) {

		int array1[] = new int[8];
		int array2[] = new int[8];
		int resultArray[] = new int[8];
		for (int i = 7; i >= 0; i--) {
			if (parameter1 % 2 == 0) {
				array1[i] = 0;
			} else {
				array1[i] = 1;
			}
			parameter1 = parameter1 / 2;
		}
		for (int j = 7; j >= 0; j--) {
			if (parameter2 % 2 == 0) {
				array2[j] = 0;
			} else {
				array2[j] = 1;
			}
			parameter2 = parameter2 / 2;
		}
		for (int i = 7; i >= 0; i--) {
			if (array1[i] == 0 || array2[i] == 0) {
				resultArray[i] = 0;
			} else if (array1[i] == 1 && array2[i] == 1) {
				resultArray[i] = 1;
			}
		}
		double sum=0;
		for(int i=resultArray.length-1; i>=0; i--) {
			double pow=Math.pow(2, resultArray[i]);
			sum=sum+pow;
		}
		return sum;
	}
}