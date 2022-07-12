package sec10.exam01_static_member;

public class Calculator {
	// static : 고정된 값이기에 하나의 변수, 단하나만 가지고 있을 수 있다.
	// 객체가 변경되도 영향을 받지 않음. 때문에 메소드에서 작성하면 컴파일 에러로 발생.
	static double pi =3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
	
}
