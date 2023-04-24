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
	
	@Test
	void
	test4() {
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, my freind",Welcome.welcome("  "));
		assertEquals("Hello, Marck",Welcome.welcome("marck"));
		assertEquals("Hello, Jean, Louis",Welcome.welcome("jean,louis"));
		assertEquals("Hello, JACK !",Welcome.welcome("JACK"));
		assertEquals("Hello, Gireaud, Jean",Welcome.welcome("gireaud,jean"));	
	}
	
	@Test
	void test5() {
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, my freind",Welcome.welcome(""));
		assertEquals("Hello, my freind",Welcome.welcome("    "));
		assertEquals("Hello, JACK !",Welcome.welcome("JACK"));
		assertEquals("Hello, Jean, Kelvin, Paul, Poole",Welcome.welcome("jean,kelvin,paul,poole"));
		assertEquals("Hello, Marie, Christelle, Cédric",Welcome.welcome("Marie,christelle,cédric"));
		assertEquals("Hello, William, Reine",Welcome.welcome("william,reine"));
	}

}
