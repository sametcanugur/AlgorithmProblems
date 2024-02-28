package JavaExercises;

public class ReverseandCapitalize {

	public static void main(String[] args) {
		System.out.println(stringConvertor("abc"));
	}

	public static String stringConvertor(String text) {
		String convertedText=text.toUpperCase();
		String result="";
		for(int i=text.length()-1; i>=0; i--) {
			result=result+convertedText.charAt(i);
		}
		return result;
	}
}

//String convertedText=text.toUpperCase();
//char array[]=convertedText.toCharArray();
//char convertedArray[]=new char[array.length];
//int k=array.length-1;
//for(int i=0; i<convertedArray.length; i++) {
//	convertedArray[i]=array[k];
//	k--;
//}
//System.out.print(Arrays.toString(convertedArray));
//return Arrays.toString(convertedArray);