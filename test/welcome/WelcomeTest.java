package welcome;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void test1() {
		assertEquals("Hello, Poole", Welcome.welcome("poole"));
		assertEquals("Hello, Jean-paul", Welcome.welcome("jean-paul"));
		assertEquals("Hello, Fernando", Welcome.welcome("fernando"));
	}

}
