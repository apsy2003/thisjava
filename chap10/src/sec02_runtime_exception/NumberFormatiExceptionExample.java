package sec02_runtime_exception;

public class NumberFormatiExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		//10번이 오류라고 뜨는데, 이유는 변환하지 못해서.
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);

	}

}
