package Sorular;

public class HowManyDsAreThere {

	public static void main(String[] args) {
		System.out.println(find("Delamin aleykum dabi"));
	}

	public static int find(String sentence) {
		int count = 0;
		String sentence2 = sentence.toLowerCase();
		for (int i = 0; i < sentence2.length(); i++) {
			if (sentence2.charAt(i) == 'd') {
				count++;
			}
		}
		return count;
	}
}
