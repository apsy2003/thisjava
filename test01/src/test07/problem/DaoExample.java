package test07.problem;

public class DaoExample {
	/*dbWork�̶�� �޼ҵ带 ȣ���� �� �Ű� ������ DatatAccessObject dao��� �������̽��� ���� �Ǿ� �����Ƿ�
	OracleDao�� MySqlDao�� �������̽� ���� Ŭ������ ����ȭ�� dao.select(); ~ dao.delete(); 4���� �߻� �޼ҵ带 ������*/
	public static void dbWork(DataAccessObject dao) {
				dao.select();
				dao.insert();
				dao.update();
				dao.delete();
	}
	public static void main(String[] args) {
				dbWork(new OracleDao());
				dbWork(new MySqlDao());

	}

}
