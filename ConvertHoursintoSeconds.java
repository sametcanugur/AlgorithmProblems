package Sorular;

public class ConvertHoursintoSeconds {

	public static void main(String[] args) {
		System.out.println(timeConvertor(3));
	}

	public static String timeConvertor(int hours) {
		int second = hours * 3600;
		return (second + " second");
	}
}
