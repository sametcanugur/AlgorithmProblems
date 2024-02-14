package Sorular;

public class HelloHelloWorldWorld {

	public static void main(String[] args) {
		System.out.println(typer(101));
	}

	public static String typer(int number) {

		if (number % 15 == 0) {
			return "Hello World";
		} else if (number % 3 == 0) {
			return "Hello";
		} else if (number % 5 == 0) {
			return "World";
		}
		return "";
	}
}
