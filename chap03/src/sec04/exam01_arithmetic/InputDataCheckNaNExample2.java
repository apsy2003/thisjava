package sec04.exam01_arithmetic;

public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		String userInput = "NaN";
		double va1 = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(va1)) { // Not a Number True(���ڿ��� ��), �����̸� false
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����");
			va1 = 0.0;
		}
		
		currentBalance +=va1;
		System.out.println(currentBalance);
	}

}
