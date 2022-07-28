package sec05_try_with_resources;

public class FileInputStream implements AutoCloseable {
	private String file;
	public FileInputStream(String file) {
		this.file = file; //자동으로 생성되려면 인터페이스를 상속받아야함. 그것이 바로 AutoCloseable인터페이스(중요)하고 override를 해야만 실행이 가능.
	}
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
	@Override
	public void close() throws Exception {
		 System.out.println(file + "을 닫습니다.");
		
	}
}
