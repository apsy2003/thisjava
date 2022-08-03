package sec12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		
		//대입시 자동 Unboxing
		//객체를 넣을 수 있음. 객체도 수로 인식함(100).
		int value = obj;
		System.out.println("value:" + value);

		//연산시 자동 Unboxing //계산이 되어지고 있다.
		int result = obj + 100;
		System.out.println("result:" + result);
	}
}
