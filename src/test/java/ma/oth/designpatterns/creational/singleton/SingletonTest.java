package ma.oth.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Suite for all Singleton implementations")
public class SingletonTest {

	@Test
	public void shoud_Return_SameSingleton() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		assertEquals(s1, s2);
	}

	@Test
	public void shoud_Return_SameSingletonHolder() {
		SingletonHolder s1 = SingletonHolder.getInstance();
		SingletonHolder s2 = SingletonHolder.getInstance();

		assertEquals(s1, s2);
	}

	@Test
	public void shoud_Return_SameSingletonLazy() {
		SingletonLazy s1 = SingletonLazy.getInstance();
		SingletonLazy s2 = SingletonLazy.getInstance();

		assertEquals(s1, s2);
	}

	@Test
	public void shoud_Return_SameSingletonLazySynchronized() {
		SingletonLazySynchronized s1 = SingletonLazySynchronized.getInstance();
		SingletonLazySynchronized s2 = SingletonLazySynchronized.getInstance();

		assertEquals(s1, s2);
	}
	
	@Test
	public void shoud_Return_SameSingletonLazySynchronizedDoubleCheck() {
		SingletonLazySynchronizedDoubleCheck s1 = SingletonLazySynchronizedDoubleCheck.getInstance();
		SingletonLazySynchronizedDoubleCheck s2 = SingletonLazySynchronizedDoubleCheck.getInstance();

		assertEquals(s1, s2);
	}

}
