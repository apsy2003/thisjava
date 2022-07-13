package sec03.exam01_parent_constructor_call;

public class People {
	public String name;
	public String ssn;
		
	/*기본생성자를 안넣은 상태
	 public People() {
		
	}*/
	
	//생성자
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
