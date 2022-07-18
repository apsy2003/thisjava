package chap08.sec02.exam03_abstract_method;
	//interface는 다중 상속이 가능, 상속이라 이야기 않고 구현이라 표현함. 다중 구현.
public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 //실행 함수를 쓰면 오히려 오류가 발생됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
