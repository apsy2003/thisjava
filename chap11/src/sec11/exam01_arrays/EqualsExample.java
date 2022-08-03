package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2}, {3,4}};
		
		//얕은 복사 후 비교
		//객체라는 것은 주소를 가르키는 것. 흰영역이 사실 주소가 있음. 주소를 찾아가면 실제 값이 들어있음
		//original.equals(cloned1)는 주소를 비교한 것. cloned1과 original은 각각 다른 객체로 구성되어있기 때문에 false가 나옴.
		//Arrays.equlas로 진행시, 1차 배열의 항목값은 복제되어 동일하기에 true가 나옴.
		//얕은복제의 단점 : 하나를 바꾸면 다 바뀜. deepEqulas는 원본은 두고 바꾸면 사용할 수 있음
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1)); 
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
	
		//깊은 복사 후 비교 (안의 이차원 배열도 복사하여 사용)
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		//중첩 배열 값 자체는 동일하다고 확인되기에 true.
		System.out.println("배열 번지 비교: " + original.equals(cloned2)); 
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}

	
}
