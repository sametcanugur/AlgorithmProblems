package Sorular;

public class CalculateUsingStringOperation {

	public static void main(String[] args) {
		System.out.println(calculator(2,3,"*"));
	}

	public static int calculator(int number1, int number2, String mathoperator) {

		if(mathoperator=="+") {
			return number1+number2;
		}
		else if(mathoperator=="-") {
			return number1-number2;
		}
		else if(mathoperator=="*") {
			return number1*number2;
		}
		else if(mathoperator=="/") {
			return number1/number2;
		}
		else if(mathoperator=="%") {
			return number1%number2;
		}
		return 0;
	}
}
