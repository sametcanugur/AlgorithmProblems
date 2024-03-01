package JavaExercises;

public class FindTheSecondLargestNumber {

	public static void main(String[] args) {
		
		int array[]= {10, 40, 30, 20, 50};
		System.out.println(largestNumberFinder(array));
	}

	public static int largestNumberFinder(int array[]) {
		
		int k=0;
		int n=0;
		for(int i=0; i<array.length; i++) {
			for(int j=n; j<array.length; j++) {
				if(array[i]<array[j]) {
					k=array[i];
					array[i]=array[j];
					array[j]=k;
				}
			}
			n++;
		}
		return array[1];
	}
}
