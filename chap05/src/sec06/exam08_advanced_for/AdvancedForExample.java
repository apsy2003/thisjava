package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0; /*scores가 배열 값 score는 i와 같은 느낌 ; 자동으로 내용을 반복 */
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum /  scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
