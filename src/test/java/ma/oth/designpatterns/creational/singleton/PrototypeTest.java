package ma.oth.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ma.oth.designpatterns.creational.prototype.ConcretePrototype1;

@DisplayName("Test Suite for Prototype")
public class PrototypeTest {

	@Test
	public void shoudReturnNewObjectwithSameValues() {

		ConcretePrototype1 cp1 = new ConcretePrototype1("Adil");
		ConcretePrototype1 cp2 = cp1.clone();

		assertFalse(cp1 == cp2);
		assertEquals(cp1, cp2);
	}

}
