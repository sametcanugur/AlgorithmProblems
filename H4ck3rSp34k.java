package JavaExercises;

public class H4ck3rSp34k {

	public static void main(String[] args) {
		System.out.println(h4ck3rSp34kCreator("javascript is cool"));
	}

	public static String h4ck3rSp34kCreator(String text) {
		
		char firstArray[] = text.toCharArray();
		char resultArray[] = new char[firstArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] == 'a') {
				firstArray[i] = '4';
			}
			if (firstArray[i] == 'e') {
				firstArray[i] = '3';
			}
			if (firstArray[i] == 'i') {
				firstArray[i] = '1';
			}
			if (firstArray[i] == 'o') {
				firstArray[i] = '0';
			}
			if (firstArray[i] == 's') {
				firstArray[i] = '5';
			}
			resultArray[i] = firstArray[i];
		}
		String string = String.valueOf(resultArray);
		return string;
	}
}

//SOLUTION FROM SHORTWAY

//text=text.replaceAll("a", "4");
//text=text.replaceAll("e", "3");
//text=text.replaceAll("i", "1");
//text=text.replaceAll("o", "0");
//text=text.replaceAll("s", "5");
//System.out.println(text);