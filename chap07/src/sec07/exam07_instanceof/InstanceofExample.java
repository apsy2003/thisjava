package sec07.exam07_instanceof;

public class InstanceofExample {
	public static void method1(Parent parent){
		if(parent instanceof Child) {
			// Child 타입으로 변환 가능한지 확인
			// instance에서 if문을 활용하여 사용할 수 있는 지 확인 후 사용.
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	/*public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}*/

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		/*method2(parentA);*/
		
		Parent parentB = new Child();
		method1(parentB);
		/*method2(parentB);*///예외 발생
		
	}
}