package sec00.homework;

public class PracticeFor {

	public static void main(String[] args) {
		int i = 1; //for���ǿ� i���� ��Ÿ�� ���� ������ ��
		int total = 0;
		//for���� �ȿ� i���� ���� ��, int i = 1�� �ᵵ�ǰ� �Ƚᵵ ��
		for(i=1; i<=10; i++) {
			total += i;
			System.out.print(i);
			
			if(i!=10) {System.out.print("+");}
		}
		System.out.print("=" + total);
	}

}
