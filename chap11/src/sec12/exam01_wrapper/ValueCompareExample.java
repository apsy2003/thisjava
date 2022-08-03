package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과:"+(obj1 == obj2));
		System.out.println("언박싱후 == 결과:" + (obj1.intValue() == obj2.intValue()));
		System.out.println("equlas() 결과: " + obj1.equals(obj2));
		System.out.println("======================================");
		//초과값일 때, unboxing을 시켜줍니다. 
		//언박싱을 시켜주면 같은 값으로 인식을 시켜주어 결과는 true로 확인된다.
		//equals의 결과도 같다.
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과:"+(obj3 == obj4));
		System.out.println("언박싱후 == 결과:" + (obj3.intValue() == obj4.intValue()));
		System.out.println("equlas() 결과: " + obj3.equals(obj4));
		//시켜주나 안시켜주나 결과는 같지만, 초과값일때는 반드시 언박싱을 적용해주어야 합니다.
		// 본래 정의하고자 하는 예제는 첫번째 예제가 맞고 두번째 예제는 예시로 미만값을 보여주기 위해 적용해본 것.

	}

}
