package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void findClass() throws ClassNotFoundException{//Ŭ���������� �̷� ������ �߻��� �� �ֽ��ϴ�.�� �ǹ̡�
		Class clazz = Class.forName("java.lang.String2");
				// ClassNotFoundException�� ���־�� ������ ������ �� ����. ���� ���� ��ƴٰ� ���.
	}
}
