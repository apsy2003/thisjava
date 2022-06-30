package sec02.exam01_if;

public class IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// 0.1123458 ~ 5.236789 //1에서 6사이의 범위가 랜덤으로 나옴 - random
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
