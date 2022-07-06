package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name)_ 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드 //Sunday가 어디에 있어? 몇번째 있어? 0부터 카운트 됨. 전체에서 순서가 몇번째 있는지 확인할 때 적용될 수 있음.
		int ordinal = today.ordinal();
		System.out.println(ordinal); 
		
		//compareTo() 메소드  // compareTo()를 기준으로 몇번째 있는지
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		/*Week weekDay = Week.valueOf("SUNDAY"); //둘중 하나의 연산자가 맞더라도 주말이군요가 나온다.//문자열과 같다.
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요.");
		} else {
			System.out.println("평일 이군요.");
		}*/
		
		if(args.length ==1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요.");
			}
		}
			
		//values() 메소드 // 주를 다 찍어봄..?
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
