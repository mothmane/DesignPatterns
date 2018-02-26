package ma.oth.designpatterns.creational.singleton;

public class SingletonLazySynchronizedDoubleCheck {

	private static SingletonLazySynchronizedDoubleCheck instance;

	private SingletonLazySynchronizedDoubleCheck() {

	}

	public static SingletonLazySynchronizedDoubleCheck getInstance() {
		
			if (instance == null) {
				instance = new SingletonLazySynchronizedDoubleCheck();
			}
			return instance;
		
	}

}
