package Sorular;

public class ConcatenateFirstandLastNameintoOneString {

	public static void main(String[] args) {
		System.out.print(printSurnameAndName("Can", "Ugur"));
	}

	public static String printSurnameAndName(String firstName, String lastName) {
		return lastName + firstName;
	}
}
