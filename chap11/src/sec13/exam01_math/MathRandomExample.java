package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		// 0~5까지 난수가 발생. 형변환으로 소주점을 띄고/ 내가 얻으려고하는 숫자 +1  random의 공식 
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈:" + num);
	}

}
