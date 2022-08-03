package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java "); //~�ڿ� append
		sb.append("Program Study"); 
		System.out.println(sb.toString()); 
		
		sb.insert(4,"2"); // �߰��� �Ű���
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6'); //���ڿ����� �־��� index�� ���ڸ� �ٸ����ڷ� ��ġ
		System.out.println(sb.toString());
		
		sb.replace(6, 13,"Book"); //6,book
		System.out.println(sb.toString());
		
		sb.delete(4,5);//����
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: " + length);
		
		String result = sb.toString();
		System.out.println(result);

	}

}
