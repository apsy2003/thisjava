package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(/*3*/); 
		//시드값을 기초하여 랜던값을 실행. 랜덤은 랜덤이지만 값을 고정 시켜 적용됨. (진짜 랜덤을 실행하려면 아무것도 넣지 않음)
		System.out.print("선택 번호: ");
		for(int i= 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(/*5*/);
		System.out.print("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
