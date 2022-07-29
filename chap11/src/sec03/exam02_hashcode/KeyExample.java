package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//전체 배열의 종류와도 같은것? key와 내용이 들어있는데, key의 값은 내가 설정할 수 있다.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();//Key를 설정하는 법 HashMap은 ctrl+Shift+o를 통해 적용가능.
		hashMap.put(new Key(1),"홍길동"); //자료를 넣는 방법
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}

}
