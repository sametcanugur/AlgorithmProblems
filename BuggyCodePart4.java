package Sorular;

public class BuggyCodePart4 {

	public static void main(String[] args) {
		System.out.println(sentenceCreator("Can"));
	}

	public static String sentenceCreator(String name) {
		if (name.equals("Aysu")) {
			return "Hello, My Love";
		} else if (name.equals("Ahmet")) {
			return "Hello, My Friend";
		}
		return "Hello, " + name;
	}
}
