package sec07.exam01.constructor_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); (x)
		//Car생성자 조건에 설정한 값이 있기 때문에 나열시 지정한 명칭이 꼭 들어가야한다.
	}

}
