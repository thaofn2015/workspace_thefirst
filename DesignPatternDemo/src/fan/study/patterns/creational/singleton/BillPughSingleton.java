package fan.study.patterns.creational.singleton;

public class BillPughSingleton {
	
	private class BillPughSingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	private BillPughSingleton() {
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
	
	
	
}
