package test02;

public class Exercise03 {

	public static class ShopService {
		private ShopService singletone = new ShopService();
			public static ShopService.getInstance(){

			}return singletone;
	}
}

