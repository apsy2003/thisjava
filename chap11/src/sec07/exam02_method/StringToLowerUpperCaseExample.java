package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr3 = str1.toUpperCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr3);
		String lowerStr2 = str2.toLowerCase();
		String lowerStr4 = str2.toUpperCase();
		System.out.println(lowerStr2);
		System.out.println(lowerStr4);
		System.out.println(lowerStr1.equals(lowerStr2));
		//소문자, 대문자 출력방식
		System.out.println(str1.equalsIgnoreCase(str2));

	}

}
