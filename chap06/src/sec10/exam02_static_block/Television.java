package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	//static String info = company + "-" + model;
	
	static {
		/*Static �� �ȿ� �����ߴٴ� ���� ����.
		�Ϲ����� field�� method�� �ۿ� �����ؾ���.*/
		//field1 = 20; (x)
		//method (); (x)
		info = company + "-" + model;
	}
	
	/*Static void method() {
		obj1.company = Television ("LG����");
	}*/
	
	void method1() {
		
	}
	static void method2() {
		//this.field = 10; (x)
		//this.method1(); (x) 
		/*static�� �����߱� ������ : (�� ������ �� �ϳ��� ��ü�� �����ؼ� ���� �߰��ϰԵǸ� 1���� �̻��� ���� �Ǳ� ������ ������ �ȴ�.)*/
	}
	
}
	
