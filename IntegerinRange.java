//method has 3 parameters integer. 
//if parameter1>=parameter2 and paramter1<parameter3  >>return true  
//else return false
//in the main,you should call the method.

package Sorular;

public class IntegerinRange {
	public static void main(String[] args) {
		 System.out.println(checkTheFirstParameter(3,2,4));
	}

	public static boolean checkTheFirstParameter(int parameter1, int parameter2, int parameter3) {
		if (parameter1 >= parameter2 && parameter1 < parameter3) {
			return true;
		}
		return false;
	}
}
