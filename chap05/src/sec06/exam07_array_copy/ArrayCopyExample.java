package sec06.exam07_array_copy;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		//System.arraycopy(복사할 배열 이름, 복사할 배열 시작 주소, 옮길 배열 이름, 옮길 배열 시작값, 복사할 배열 길이)
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}

	}

}
