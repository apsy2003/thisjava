package sec13.exam01_math;

public class MathExample {
		
	public static void main(String[] args) {
		//절대값 -를 붙인것은 전부 양수로 출력이 됨.
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("=========================");
		
		//ceil 높은값으로 상향조정 - 예시로 5.3이면 = 6임
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		System.out.println("=========================");
		
		//floor 낮은값으로 하향조정 - 예시로 5.3이면 = 5임
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);
		System.out.println("=========================");
		
		//두개의 수 중, 크기가 큰값을 이야기함.
		int v7 = Math.max(5,9);
		double v8 = Math.max(5.3,2.5);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);
		System.out.println("=========================");
		
		//두개의 수 중, 크기가 작은값을 이야기함.
		int v9 = Math.min(5,9);
		double v10 = Math.min(5.3,2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);
		System.out.println("=========================");
		
		//Random 0부터 수를 세지만, 1은 포함하지 않음.
		double v11 = Math.random();
		System.out.println("v11=" + v11);
		System.out.println("=========================");
		
		//rint 정의된 수에서 가까운 정수를 뜻함.
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(-5.7);
		System.out.println("v12="+v12);
		System.out.println("v13="+v13);
		System.out.println("=========================");
		
		//round 반올림.
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14="+v14);
		System.out.println("v15="+v15);
		System.out.println("=========================");
		
		double value = 12.3456; // 12.3456
		double temp1 = value*100; //1234.56
		long temp2 = Math.round(temp1); //1235
		double v16 = temp2 / 100.0; //12.35
		System.out.println("v16="+v16);
	}

}
