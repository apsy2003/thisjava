package sec03.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		for(int n=1; n<=9; n++) {
			for (int m=2; m<=9; m++) {
				System.out.print(m + " x " + n + " = " + (m*n) + "\t");
				// \t �� ����
			}
			System.out.println(" ");
		}

	}
}
