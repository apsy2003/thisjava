package sec04.exam03_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // 같냐
		boolean result2 = (num1 != num2); // 1이 2보다 작지 않냐
		boolean result3 = (num1 <= num2); //1이 2보다 작거나 같냐
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // char1 - A:65 char2 - B:66 이기 때문에 char2가 크다가 True. 
		System.out.println("result4=" + result4);

	}

}
