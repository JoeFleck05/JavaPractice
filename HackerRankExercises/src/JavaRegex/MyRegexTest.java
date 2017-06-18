package JavaRegex;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRegexTest {

	MyRegex myRegex = new MyRegex();
	
	private final String S_1 = "000.12.12.034";
	private final String S_2 = "121.234.12.12";
	private final String S_3 = "23.45.12.56";
	private final String S_4 = "00.12.123.123123.123";
	private final String S_5 = "122.23";
	private final String S_6 = "Hello.IP";
	
	@Test
	public void test() {
		assertTrue(myRegex.myRegex(S_1));
	}
	
	@Test
	public void test1() {
		assertTrue(myRegex.myRegex(S_2));
	}
	
	@Test
	public void test2() {
		assertTrue(myRegex.myRegex(S_3));
	}
	
	@Test
	public void test3() {
		assertFalse(myRegex.myRegex(S_4));
	}
	
	@Test
	public void test4() {
		assertFalse(myRegex.myRegex(S_5));
	}
	
	@Test
	public void test5() {
		assertFalse(myRegex.myRegex(S_6));
	}

}
