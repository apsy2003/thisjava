package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
	A a = new A();
	a.field1 = 1;			//(o)
	//a.field2  = 1; 		//(x) default �ʵ����� �Ұ�(�����Ͽ���)
	//a.field3  = 1; 		//(x) private �ʵ����� �Ұ�(�����Ͽ���)
	
	a.method1();					//(O)
	//a.mehod2();				//(x) default �޼ҵ� ���� �Ұ�(������ ����) 
	//a.mehod3();				//(x) private �޼ҵ� ���� �Ұ�(������ ����) 
	}
}
