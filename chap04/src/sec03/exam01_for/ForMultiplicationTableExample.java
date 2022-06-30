package sec03.exam01_for;

public class ForMultiplicationTableExample {
	//중첩 for문 , 배열을 이용해서 값을 도출할 때 사용됨.
	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
