package test02;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("OracleDao DB���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("OracleDao DB�� ����");
		
	}

	@Override
	public void update() {
		System.out.println("OracleDao DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("OracleDao DB���� ����");
		
	}

}
