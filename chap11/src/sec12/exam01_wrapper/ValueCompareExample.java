package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==���:"+(obj1 == obj2));
		System.out.println("��ڽ��� == ���:" + (obj1.intValue() == obj2.intValue()));
		System.out.println("equlas() ���: " + obj1.equals(obj2));
		System.out.println("======================================");
		//�ʰ����� ��, unboxing�� �����ݴϴ�. 
		//��ڽ��� �����ָ� ���� ������ �ν��� �����־� ����� true�� Ȯ�εȴ�.
		//equals�� ����� ����.
		
		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==���:"+(obj3 == obj4));
		System.out.println("��ڽ��� == ���:" + (obj3.intValue() == obj4.intValue()));
		System.out.println("equlas() ���: " + obj3.equals(obj4));
		//�����ֳ� �Ƚ����ֳ� ����� ������, �ʰ����϶��� �ݵ�� ��ڽ��� �������־�� �մϴ�.
		// ���� �����ϰ��� �ϴ� ������ ù��° ������ �°� �ι�° ������ ���÷� �̸����� �����ֱ� ���� �����غ� ��.

	}

}
