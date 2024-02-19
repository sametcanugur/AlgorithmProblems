package JavaExercises;

public class AddingParityBits {

	public static void main(String[] args) {

		System.out.println(binaryAdder("0101101"));
	}

	public static String binaryAdder(String binary) {

		String result = "";
		int sum = 0;
		for (int i = 0; i < binary.length(); i++) {
			result = result + binary.charAt(i);
			sum = sum + binary.charAt(i);
		}
		if (sum % 2 == 0) {
			result = result + "0";
		} else {
			result = result + "1";
		}
		return result;
	}
}
