package ma.oth.designpatterns.creational.singleton;

/**
 * A Synchoronized Singleton with Lazy Loading to use in multi threading context
 * 
 * @author othmane
 *
 */
public class SingletonLazySynchronizedDoubleCheck {

	/*
	 * Static property that holds the singeleton instance Not initialized when the
	 * class loads
	 */
	private static SingletonLazySynchronizedDoubleCheck instance;

	/**
	 * private Constructor to prevent direct instanciation
	 */
	private SingletonLazySynchronizedDoubleCheck() {

	}
	/**
	 * When the first call occurs this method initialise the static instance
	 * variable and it's thread safe with double checking mecanism
	 * 
	 * @return SingletonLazy The only SingletonLazy instance that exists
	 */
	public static SingletonLazySynchronizedDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (SingletonLazySynchronizedDoubleCheck.class) {
				if (instance == null) {
					instance = new SingletonLazySynchronizedDoubleCheck();
				}
			}
		}
		return instance;

	}

}
