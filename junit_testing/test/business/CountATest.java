package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void testCountA() {
		JUnitTesting j = new JUnitTesting ();
		int output = j.countA("What are all of the answers?");
		assertEquals(4, output);
	}

}
