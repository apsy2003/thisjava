package test08.problem;

public class Parent {//부모에 기본생성자가 없다. 때문에 Child에는 this.name = name;이 아닌 super(name);을 적어주어야 오류가 사라진다.
			public String name;
			
			public Parent(String name) {
						this.name = name;
			}
}
