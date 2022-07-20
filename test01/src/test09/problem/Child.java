package test09.problem;

public class Child extends Parent {
			private String name;
			
			public Child() {
					//(1) 원래 super();가 상속되어야함 그러나 상속받은 객체에서 (super/this)둘다 나올 수 없기 때문에, 고로 this 때문에 super는 생성될 수 없음*/
					this("홍길동"); //(2) 인자가 하나인 아래 매소드child(string name)가 실행됨.
					System.out.println("Child() call");
			}
			
			public Child(String name) { //(3) 이 생성자(파라메터가 하나인..) super()를 호출.
					this.name = name;
					System.out.println("Child(String name) call");
			}
}
