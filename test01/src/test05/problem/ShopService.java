package test05.problem;

public class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService(){}; //�⺻�����ڸ� ���� ��, private���� ��������. ���� �������� ���ϰ�.
	public static ShopService getInstance() {
		return singleton;
	}
}
