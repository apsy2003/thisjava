package test09.problem;

public class Child extends Parent {
			private String name;
			
			public Child() {
					//(1) ���� super();�� ��ӵǾ���� �׷��� ��ӹ��� ��ü���� (super/this)�Ѵ� ���� �� ���� ������, ��� this ������ super�� ������ �� ����*/
					this("ȫ�浿"); //(2) ���ڰ� �ϳ��� �Ʒ� �żҵ�child(string name)�� �����.
					System.out.println("Child() call");
			}
			
			public Child(String name) { //(3) �� ������(�Ķ���Ͱ� �ϳ���..) super()�� ȣ��.
					this.name = name;
					System.out.println("Child(String name) call");
			}
}
