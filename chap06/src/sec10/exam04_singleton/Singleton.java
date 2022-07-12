package sec10.exam04_singleton;

// public 외부에서 접근 가능.
public class Singleton {
	//객체를 하나 밖에 선언하지 못함.
	//외부에서 접근 금지 private.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
