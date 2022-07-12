package sec11.exam01_final;

class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	//객체 마다 선언할 수 있다. final
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
