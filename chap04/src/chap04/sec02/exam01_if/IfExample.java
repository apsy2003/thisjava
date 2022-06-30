package chap04.sec02.exam01_if;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score<90)
			System.out.println("점수가 90보다 작습니다.");
		//if 구절에 {}를 안했을 시, 한 구절만 {}한 것과 같다. 때문에 "등급은 B 입니다."구절은 독립구절로 콘솔에 표시가 된다.	
		System.out.println("등급은 B 입니다.");
	}

}
