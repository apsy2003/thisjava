package sec03.exam03_tostring;//저절로 만들어진 메소드이기에 사용할 때, 상속해서 재정의 할 수 있음.

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);

	}

}
