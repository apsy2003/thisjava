package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//배열 복사하는 방법 1 [copyOf는 원본과 원본 길이 메소드!]
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//배열 복사하는 방법2 [copyOfRange는 원본과 K번째 수/ 원본배열/시작인덱스/끝인덱스(시작인덱스~끝인덱스-1까지 항목복사)]
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//배열 복사하는 방법3 [System.arraycopy() - 원본배열/원보시작인덱스/타겟배열/타겟시작인덱스/복사개수]
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4{" + i + "]=" + arr4[i]);
			
		}
		
	}

}
