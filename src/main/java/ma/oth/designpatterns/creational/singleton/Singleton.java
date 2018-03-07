package ma.oth.designpatterns.creational.singleton;

/**
 * This is a simple implementation of the design pattern Singleton an instance
 * of the class is loaded when the class definition is loaded
 * 
 * @author othmane
 *
 */
public class Singleton {
	/*
	 * static variable to hold the single instance
	 */
	private static Singleton instance = new Singleton();

	/**
	 * private Constructor to prevent direct instanciation
	 */
	private Singleton() {

	}

	/**
	 * 
	 * @return the single instance created when class is loaded
	 */
	public static Singleton getInstance() {
		return instance;
	}

}
