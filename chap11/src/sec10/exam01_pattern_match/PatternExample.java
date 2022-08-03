package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // \d�ں��� ���� : ���ڸ� ���.
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}
		
		//white@naver.com (or) white@naver.co.kr // \w+ �Ѱ��̻��� ���ĺ��� �ǹ�
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "apsy2003@naver.com";
		result =Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}
	//��¥�� �Ϲ� ���ڸ� �����ؼ� ������ ���̽��� �����ϱ� ���� ���Խ� ǥ��.
	//^\\d{4}-\\d{2}-\\d{2}$
}
