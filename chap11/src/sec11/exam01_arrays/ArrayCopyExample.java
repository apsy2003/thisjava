package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		//�迭 �����ϴ� ��� 1 [copyOf�� ������ ���� ���� �޼ҵ�!]
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
	}

}
