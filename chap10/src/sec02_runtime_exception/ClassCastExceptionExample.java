package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		// ClassCastException 발생가능
		// 하위의 dog이 오류 이유 : changeDog(cat)로 인해 에러가 발생할 수 있다.
		Dog dog = (Dog) animal;
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
