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
		assertEquals("Hello, Jean and Louis",Welcome.welcome("jean,louis"));
		assertEquals("Hello, JACK !",Welcome.welcome("JACK"));
		assertEquals("Hello, Gireaud and Jean",Welcome.welcome("gireaud,jean"));	
	}
	
	@Test
	void test5() {
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, my freind",Welcome.welcome(""));
		assertEquals("Hello, my freind",Welcome.welcome("    "));
		assertEquals("Hello, JACK !",Welcome.welcome("JACK"));
		assertEquals("Hello, Jean, Kelvin, Paul and Poole",Welcome.welcome("jean,kelvin,paul,poole"));
		assertEquals("Hello, Marie, Christelle and Cédric",Welcome.welcome("Marie,christelle,cédric"));
		assertEquals("Hello, William and Reine",Welcome.welcome("william,reine"));
	}
	
	
	@Test
	void test6() {
		assertEquals("Hello, my freind",Welcome.welcome(""));
		assertEquals("Hello, my freind",Welcome.welcome(null));
		assertEquals("Hello, Amy and Jerry. AND Hello BOB AND JACK !",Welcome.welcome("Amy,BOB,Jerry,JACK"));
		assertEquals("Hello, Amy and Jerry. AND Hello BOB AND ROBERT !",Welcome.welcome("Amy,BOB,ROBERT,Jerry"));
		assertEquals("Hello, Poole. AND Hello CHRIS !",Welcome.welcome("Poole,CHRIS"));
		assertEquals("Hello, JACK AND CHRIS !",Welcome.welcome("JACK,CHRIS"));
	}
	
	@Test
	void test7() {
		assertEquals("Hello, Bob, Amy and Jerry",Welcome.welcome("bob,amy,jerry"));
		assertEquals("Hello, Bob and Jerry. AND Hello AMY AND JACK !",Welcome.welcome("bob,AMY,jerry,JACK"));
		assertEquals("Hello, Bob and Jerry. AND Hello AMY ROLANDS AND JACK !",Welcome.welcome("bob,AMY,jerry,ROLANDS,JACK"));
		assertEquals("Hello, Bob and Jerry. AND Hello AMY !",Welcome.welcome("bob,AMY,jerry"));
		assertEquals("Hello, Bob. AND Hello AMY AND JACK !",Welcome.welcome("bob,AMY,JACK"));
	}
	
	@Test
	void test8() {
		assertEquals("Hello, Fernando", Welcome.welcome("         fernando"));
		assertEquals("Hello, Bob. AND Hello AMY AND JACK !",Welcome.welcome("bob,    AMY,       JACK"));
		assertEquals("Hello, JACK !",Welcome.welcome("   JACK"));
		assertEquals("Hello, Bob, Amy and Jerry",Welcome.welcome("  bob,  amy, jerry"));
		assertEquals("Hello, Bob and Jerry. AND Hello AMY ROLANDS AND JACK !",Welcome.welcome(" bob,   AMY, jerry ,    ROLANDS , JACK"));
		
	}
	
	@Test
	void test9() {
		assertEquals("Hello, Bob (x3) and Amy. AND Hello JERRY (x2) !",Welcome.welcome("bob,JERRY,amy,bob,JERRY,bob"));
		assertEquals("Hello, Jerome (x2)",Welcome.welcome("   Jerome,   Jerome"));
		assertEquals("Hello, JACK (x2) !",Welcome.welcome("JACK,    JACK"));
		assertEquals("Hello, Bob (x2), Amy (x2) and Jerry (x2)",Welcome.welcome("   bob,  bob,  amy, amy, jerry, jerry"));
		assertEquals("Hello, Poole (x2). AND Hello CHRIS !",Welcome.welcome("Poole,CHRIS,Poole"));
		assertEquals("Hello, Poole (x2). AND Hello CHRIS (x2) !",Welcome.welcome("Poole,CHRIS,Poole,    CHRIS"));
		
		
	}

}
