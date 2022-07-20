package test05.problem;

public class ShopService {
	private static ShopService singleton = new ShopService();
	private ShopService(){}; //기본생성자를 만들 때, private으로 만들어야함. 남이 접근하지 못하게.
	public static ShopService getInstance() {
		return singleton;
	}
}
