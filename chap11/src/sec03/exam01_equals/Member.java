package sec03.exam01_equals;

public class Member {
	public String id; //id는 필드가 지정해준 값.
	
	public Member(String id) {//필드 변수에 따라 넘겨준다.
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
