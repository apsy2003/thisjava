package sec04.exam01_nestedinterface;
//구현클래스 마치, 상속받은 자식 클래스같이. 하지만 interface에서는 이를 구현이라고 칭함.

public class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
			System.out.println("전화를 겁니다.");
	}
	
}
