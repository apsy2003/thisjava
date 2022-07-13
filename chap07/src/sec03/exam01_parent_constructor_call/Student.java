package sec03.exam01_parent_constructor_call;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studntNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
