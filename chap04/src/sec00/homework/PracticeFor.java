package sec00.homework;

public class PracticeFor {

	public static void main(String[] args) {
		int i = 1; //for조건에 i값이 나타나 있음 지워도 됨
		int total = 0;
		//for조건 안에 i값을 적을 때, int i = 1로 써도되고 안써도 됨
		for(i=1; i<=10; i++) {
			total += i;
			System.out.print(i);
			
			if(i!=10) {System.out.print("+");}
		}
		System.out.print("=" + total);
	}

}
