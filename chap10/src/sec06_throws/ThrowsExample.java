package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException{//클래스에서는 이런 에러가 발생할 수 있습니다.를 의미★
		Class clazz = Class.forName("java.lang.String2");
				// ClassNotFoundException을 써주어야 실행을 진행할 수 있음. 예외 문을 모아다가 사용.
	}
}
