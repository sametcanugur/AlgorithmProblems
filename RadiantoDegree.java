package Sorular;

public class RadiantoDegree {

	public static void main(String[] args) {
		System.out.println(convertor(2));
	}

	public static double convertor(int radian) {

		return (radian * 180) / Math.PI;
	}
}
