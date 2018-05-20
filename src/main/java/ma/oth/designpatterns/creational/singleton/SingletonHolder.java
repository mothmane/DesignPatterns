package ma.oth.designpatterns.creational.singleton;

/**
 * this singleton rely on how the JVM loads classes, so the class
 * SingletonLoader is Loaded once the method getInstance is called so the
 * Singleton object is created in the first call of getInstance method
 * 
 * @author othmane
 *
 */
public class SingletonHolder {
	/*
	 * private Constructor
	 */
	private SingletonHolder() {

	}

	/**
	 * Inner static class to help load the singleton on demand
	 * 
	 * @author othmane
	 *
	 */
	private static class SingletonLoader {
		static SingletonHolder instance = new SingletonHolder();

	}

	/**
	 * 
	 * @return the Singeleton instance in th SingletonLoader static class 
	 */
	public static SingletonHolder getInstance() {
		return SingletonLoader.instance;
	}

}
