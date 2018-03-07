package ma.oth.designpatterns.creational.singleton;

/**
 * A Singleton with Lazy Loading
 * 
 * @author othmane
 *
 */
public class SingletonLazy {
	/*
	 * Static property that holds the singeleton instance Not initialized when the
	 * class loads
	 */
	private static SingletonLazy instance;

	/**
	 * private Constructor to prevent direct instanciation
	 */
	private SingletonLazy() {

	}

	/**
	 * When the first call occurs this method initialise the static instance
	 * variable
	 * 
	 * @return SingletonLazy The only SingletonLazy instance that exists
	 */
	public static SingletonLazy getInstance() {

		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;

	}

}
