package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하면 q를 입력하세요.");
		
		Scanner scanner =  new Scanner(System.in); //Ctrl+Shift+o를 누르면 오류난 값을 찾아서 수정 적용 해줌.
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine(); //nextLine 줄바꿈 의미.
			System.out.println(inputString); //inputString 현재 누른 함수가 무엇인지 체크해줌.
		} while(! inputString.equals("q") ); //equals '참'인 동안은 동일하게 적용된다.
			// !은 not을 의미
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
