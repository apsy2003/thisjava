package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����ϸ� q�� �Է��ϼ���.");
		
		Scanner scanner =  new Scanner(System.in); //Ctrl+Shift+o�� ������ ������ ���� ã�Ƽ� ���� ���� ����.
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //nextLine �ٹٲ� �ǹ�.
			System.out.println(inputString); //inputString ���� ���� �Լ��� �������� üũ����.
		} while(! inputString.equals("q") ); //equals '��'�� ������ �����ϰ� ����ȴ�.
			// !�� not�� �ǹ�
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
