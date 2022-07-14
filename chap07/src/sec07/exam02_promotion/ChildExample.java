package sec07.exam02_promotion;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; 	//객체 형변환-아이에서 부모객체로 변환됨.
								//나중에 시작되면서 @Override로 덮어버림.		
		parent.method1(); 
		
		parent.method2();
		
		//parent.method3(); (호출 불가능)
		//Child1.method3();

	}

}
