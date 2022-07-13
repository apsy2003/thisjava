package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	
	/*자식 안에서 재정의 하는 것 ! @Oerride*/
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		} 
	} 
	/*먼저 컴파일 한 후, 추가로 재정의하여 덧붙여지는 것*/
}
