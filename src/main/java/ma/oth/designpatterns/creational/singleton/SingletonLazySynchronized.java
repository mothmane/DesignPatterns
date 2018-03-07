package ma.oth.designpatterns.creational.singleton;

/**
 * A Synchoronized Singleton with Lazy Loading to use in multi threading context
 * 
 * @author othmane
 *
 */
public class SingletonLazySynchronized {

	/*
	 * Static property that holds the singeleton instance Not initialized when the
	 * class loads
	 */
	private static SingletonLazySynchronized instance;

	/**
	 * private Constructor to prevent direct instanciation
	 */
	private SingletonLazySynchronized() {

	}

	/**
	 * When the first call occurs this method initialise the static instance
	 * variable and it's thread safe
	 * 
	 * @return SingletonLazy The only SingletonLazy instance that exists
	 */
	public static synchronized SingletonLazySynchronized getInstance() {

		if (instance == null) {
			instance = new SingletonLazySynchronized();
		}
		return instance;

	}

}
