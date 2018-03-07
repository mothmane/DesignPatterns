package ma.oth.designpatterns.creational.singleton;

public class SIngletonHolder {

	private SIngletonHolder() {

	}

	private static class SingletonLoader {
		static SIngletonHolder instance = new SIngletonHolder();

	}

	public static SIngletonHolder getInstance() {
		return SingletonLoader.instance;
	}

}
