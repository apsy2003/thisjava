package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	//static String info = company + "-" + model;
	
	static {
		/*Static 블럭 안에 선언했다는 것이 문제.
		일반적인 field와 method는 밖에 설정해야함.*/
		//field1 = 20; (x)
		//method (); (x)
		info = company + "-" + model;
	}
	
	/*Static void method() {
		obj1.company = Television ("LG전자");
	}*/
	
	void method1() {
		
	}
	static void method2() {
		//this.field = 10; (x)
		//this.method1(); (x) 
		/*static을 선언했기 때문에 : (즉 고정된 값 하나에 객체를 생성해서 값을 추가하게되면 1가지 이상의 값이 되기 때문에 문제가 된다.)*/
	}
	
}
	
