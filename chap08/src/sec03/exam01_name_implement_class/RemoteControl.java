package sec03.exam01_name_implement_class;

public interface RemoteControl {
	//상수 필드 /class를 사용하기 위해 / 필드는 고칠수 없음 고칠수 없는 상수를 의미할 때, 대문자로 사용.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 //실행 함수를 쓰면 오히려 오류가 발생됨-실행함수가 존재하지 않음.//메소드는 실행블록이 있어야됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
