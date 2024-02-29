package JavaExercises;

public class ExistsaNumberHigher {

	public static void main(String[] args) {
	
		int array[]= {5, 3, 15, 22, 4};
		System.out.println(checkNumber(array,15));
	}
	
	public static boolean checkNumber(int array[], int n) {
		
		int count=0;
		if(array.length==0) {
			return false;
		}
		for(int i=0; i<array.length; i++) {
			if(array[i]>=n) {
				count++;
			}
		}
		if(count>0) {
			return true;
		}
		return false;
	}
}
