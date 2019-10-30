package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateMethodsTest {

	@Test
	public void testIsDead() {
		Pirate p = new Pirate("Captain Crunch");
		assertFalse(p.isDead());
	}

}
