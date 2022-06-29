package sec04.exam01_arithmetic;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //String 클래스 변수, 여러 문자열을 저장할 수 있음/ 무조건 문자로 저장
		String str4 = 3 + 3.0 + "JDK"; // 숫자가 앞에 있음 덧셈 문자가 앞에 있음 문자열로 인식
		System.out.println(str3);
		System.out.println(str4);

	}

}
