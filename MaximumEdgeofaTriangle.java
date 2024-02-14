package Sorular;

public class MaximumEdgeofaTriangle {

	public static void main(String[] args) {
		System.out.println(thirdSideOfRectangular(3, 4));
	}

	public static int thirdSideOfRectangular(int firstSide, int secondSide) {
		return (firstSide + secondSide) - 1;
	}
}
