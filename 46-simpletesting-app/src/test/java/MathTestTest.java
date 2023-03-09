import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTestTest {

	@Test
	void testAddition() {
		MathTest mathtest=new MathTest();
		int expected=20;
		int actual=mathtest.addition(10, 20);
		assertEquals(expected,actual);
	}
}
