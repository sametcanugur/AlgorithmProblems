package Sorular;

public class FindthePerimeterofaRectangle {

	public static void main(String[] args) {
		System.out.println(perimeterOfRectangular(3, 4));
	}

	public static int perimeterOfRectangular(int length, int width) {
		int perimeterofrectangular = 2 * (length + width);
		return perimeterofrectangular;
	}
}
