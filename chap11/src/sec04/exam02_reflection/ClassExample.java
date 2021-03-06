package sec04.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// 클래스 객체를 이용하면 클래스의 필드, 생성자, 메서드 정보를 알아낼 수 있다. → 이것을 리플렉션(Reflection)이라 함.
// 클래스 객체는 리플렉션을 위해 getDeclaredConstructors(), getDeclaredField(), getDeclaredMethods()를 제공
public class ClassExample {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("sec04.exam02_reflection.Car");
				
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields =  clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메서드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
}