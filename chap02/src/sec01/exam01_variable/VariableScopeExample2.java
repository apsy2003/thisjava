package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10){
		int v2;
			v2 = v1 - 10;
		}

		int v3 = v1 + v1 + 5;
//		int v3 = v1 + v2 + 5;
/*v2 값은 if안에서 범위가 종료되었기에, v3에서 v2값은 적용되지 않음.(v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김.)*/

		System.out.println(v3);
	}

}
