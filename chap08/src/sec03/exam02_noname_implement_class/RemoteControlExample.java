package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현 객체
		// 자식에서 선언하지 않은 것을 구현해서 디폴트로 만들어냄.
		// Interface는 객체를 만들 수 없다.
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {/*실행문*/}
			public void turnOff() {/*실행문*/}
			public void setVolume(int volume) {/*실행문*/}
		};

	}

}
