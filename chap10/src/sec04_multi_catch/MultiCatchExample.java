package sec04_multi_catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			/*Class clazz = Class.forName("java.lang.String2");*/
			//Class.forName메소드는 매개값으로 주어진 클래스가 존재하면 클래스객체를 return. 존재하지않으면 ClassNotFoundException 예외가 발생. 
			// 에러 내는 방법 : (1)10, 20 (2)10 (3)10 a20 
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 +value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException/* | ClassNotFoundException*/ e){
			System.out.println("실행 매값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("알 수없는 예외 발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}		
}


