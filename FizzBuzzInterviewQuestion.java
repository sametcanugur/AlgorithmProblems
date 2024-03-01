package JavaExercises;

public class FizzBuzzInterviewQuestion {

	public static void main(String[] args) {
		
		System.out.println(multipleCheck(30));
	}

	public static String multipleCheck(int number) {
		
		String converted=String.valueOf(number);
		
		if(number%3==0 && number%5==0) {
			return "FizzBuzz";
		}
		if(number%3==0) {
			return "Fizz";
		}
		if(number%5==0) {
			return "Buzz";
		}
		else {
			return converted;
		}
	}
}
