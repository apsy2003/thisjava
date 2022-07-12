package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		Person p2 = new Person("901109-1234567", "을지문덕");
		//객체 마다 선언할 수 있다. final
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; 나라를 바꾸려고 했더니 에러가 발생됨.
		//p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
	}
}
