package sec04.exam01_nestedinterface;
//����Ŭ���� ��ġ, ��ӹ��� �ڽ� Ŭ��������. ������ interface������ �̸� �����̶�� Ī��.

public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
	}
	
}
