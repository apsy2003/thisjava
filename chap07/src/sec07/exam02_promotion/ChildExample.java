package sec07.exam02_promotion;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; 	//��ü ����ȯ-���̿��� �θ�ü�� ��ȯ��.
								//���߿� ���۵Ǹ鼭 @Override�� �������.		
		parent.method1(); 
		
		parent.method2();
		
		//parent.method3(); (ȣ�� �Ұ���)
		//Child1.method3();

	}

}
