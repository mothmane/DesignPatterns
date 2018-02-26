package ma.oth.designpatterns.creational.singleton;

public class SingletonLazySynchronized {

	private static SingletonLazySynchronized instance;

	private SingletonLazySynchronized() {

	}

	public static  SingletonLazySynchronized getInstance() {
		
		if(instance==null){
		synchronized (SingletonLazySynchronized.class) {
					
			if (instance == null) {
				instance = new SingletonLazySynchronized();
			}
		}
		}
			return instance;
		
	}

}
