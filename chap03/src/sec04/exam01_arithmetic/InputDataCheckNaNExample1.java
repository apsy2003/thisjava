package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double va1 = Double.valueOf( userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += va1;
		System.out.println(currentBalance);

	}

}
