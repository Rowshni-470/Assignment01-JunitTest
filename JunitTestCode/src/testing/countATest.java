package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		//fail("Not yet implemented");
		JunitTesting test = new JunitTesting();
		int output = test.countA("alpaca");
		assertEquals(3,output);
	}

}
