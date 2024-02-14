//3 parameters input in method.
//return blue color/(wall width*wall height) 
//call the method in main

package Sorular;

public class IdLikeANewShadeOfBluePlease {
	public static void main(String[] args) {
		System.out.println(findingCountOfPaintedWall(10,15,12));
	}

	public static int findingCountOfPaintedWall(int color, int wallWidth, int wallHeight) {
		if(color>0 && wallWidth>0 && wallHeight>0) {
			return color / (wallWidth * wallHeight);
		}
		return -1;
	}
}
