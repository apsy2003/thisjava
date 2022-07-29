package sec03.exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		/*if(obj1==obj2) {
			System.out.println("obj1과 obj2는 동등합니다.");			
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		} // 메소드가 아니기에 재정의가 불가능. 때문에 메소드를 사용하는 것. equals는 대부분 재정의가 가능*/
		System.out.println("========================");
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else { 
		System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
