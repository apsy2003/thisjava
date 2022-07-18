package sec08.exam01_abstract_class;

public class Phone {
	//필드
	//추상클래스★
	//공통된 속성을 따로 빼는 것을 이야기한다.
	//오직 자식객체를 통해서 구현할 수 있음.
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
