package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java "); //~뒤에 append
		sb.append("Program Study"); 
		System.out.println(sb.toString()); 
		
		sb.insert(4,"2"); // 중간의 매개값
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6'); //문자열에서 주어진 index의 문자를 다른문자로 대치
		System.out.println(sb.toString());
		
		sb.replace(6, 13,"Book"); //6,book
		System.out.println(sb.toString());
		
		sb.delete(4,5);//삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
