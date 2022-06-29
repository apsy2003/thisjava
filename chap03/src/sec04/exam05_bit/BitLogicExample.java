package sec04.exam05_bit;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));// 논리 곱 둘다 1이여야 1
		System.out.println("45 | 25 = " + (45 | 25));//논리 합 하나만 1이여도 1
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		//00101101 //두가지가 0혹은 1이 같을 경우(배타적일 경우) 1
		//00011001
		//00110100
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		//System.out.println("||");
		System.out.println(toBinaryString(45&25));
	}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
