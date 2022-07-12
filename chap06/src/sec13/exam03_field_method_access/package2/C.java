package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
	A a = new A();
	a.field1 = 1;			//(o)
	//a.field2  = 1; 		//(x) default 필드접근 불가(컴파일에러)
	//a.field3  = 1; 		//(x) private 필드접근 불가(컴파일에러)
	
	a.method1();					//(O)
	//a.mehod2();				//(x) default 메소드 접근 불가(컴파일 에러) 
	//a.mehod3();				//(x) private 메소드 접근 불가(컴파일 에러) 
	}
}
