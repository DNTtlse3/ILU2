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
	
	@Test
	void test2() {
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, my freind",Welcome.welcome(""));
		assertEquals("Hello, Jerry",Welcome.welcome("jerry"));
		assertEquals("Hello, Nathan",Welcome.welcome("Nathan"));
		assertEquals("Hello, my freind",Welcome.welcome("    "));
		assertEquals("Hello, P",Welcome.welcome("p"));
	}
	
	@Test
	void test3() {
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, my freind",Welcome.welcome(""));
		assertEquals("Hello, my freind",Welcome.welcome("    "));
		assertEquals("Hello, NATHAN !",Welcome.welcome("NATHAN"));
		assertEquals("Hello, Jerome",Welcome.welcome("Jerome"));
		
	}

}
