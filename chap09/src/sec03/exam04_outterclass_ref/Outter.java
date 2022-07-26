package sec03.exam04_outterclass_ref;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {//실행하려면 바깥 객체를 먼저 형성하고 작업해야함
				System.out.println(this.field);
				this.method();
				System.out.println(Outter.this.field);
				Outter.this.method();
		}
	}
}
