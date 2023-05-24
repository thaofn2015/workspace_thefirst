package fan.study.patterns.creational.singleton;

public class StaticBlockSingleton {

	private static final StaticBlockSingleton instance;

	static {
		instance = new StaticBlockSingleton();
	}
	
	private StaticBlockSingleton() {
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
