package sec11.exam01_final;

class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	//��ü ���� ������ �� �ִ�. final
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
