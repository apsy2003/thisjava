package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		// 0~5���� ������ �߻�. ����ȯ���� �������� ���/ ���� ���������ϴ� ���� +1  random�� ���� 
		int num = (int) (Math.random()*6) + 1;
		System.out.println("�ֻ��� ��:" + num);
	}

}
