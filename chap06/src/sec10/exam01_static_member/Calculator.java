package sec10.exam01_static_member;

public class Calculator {
	// static : ������ ���̱⿡ �ϳ��� ����, ���ϳ��� ������ ���� �� �ִ�.
	// ��ü�� ����ǵ� ������ ���� ����. ������ �޼ҵ忡�� �ۼ��ϸ� ������ ������ �߻�.
	static double pi =3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
	
}
