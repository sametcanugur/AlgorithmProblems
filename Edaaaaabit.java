package Sorular;

public class Edaaaaabit {

	public static void main(String[] args) {
		System.out.println(createEdabit(2));
	}

	public static String createEdabit(int number) {
		String edabit = "";
		for (int i = 0; i < number; i++) {
			edabit = edabit + "a";
		}
		return "Ed" + edabit + "bit";
	}
}
