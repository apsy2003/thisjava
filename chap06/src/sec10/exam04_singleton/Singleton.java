package sec10.exam04_singleton;

// public �ܺο��� ���� ����.
public class Singleton {
	//��ü�� �ϳ� �ۿ� �������� ����.
	//�ܺο��� ���� ���� private.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
