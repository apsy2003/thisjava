package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//배열 복사하는 방법 1 [copyOf는 원본과 원본 길이 메소드!]
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}

}
