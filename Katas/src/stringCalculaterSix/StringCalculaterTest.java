package stringCalculaterSix;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {
	
	StringCalculaterSeven sc = new StringCalculaterSeven();
	
	private static String STRING_ONE = "//;\n89;1";
	private static int EXPECTED_INT_ONE = 90;
	
	private static String STRING_TWO = "10,89,1";
	private static int EXPECTED_INT_TWO = 100;
	
	private static String STRING_THREE = "0";
	private static int EXPECTED_INT_THREE = 0;
	
	@Test
	public void resultWithDelimiter() { assertEquals(EXPECTED_INT_ONE, sc.add(STRING_ONE)); }
	@Test
	public void resultOfNumbers() { assertEquals(EXPECTED_INT_TWO, sc.add(STRING_TWO)); }
	@Test
	public void resultZero() { assertEquals(EXPECTED_INT_THREE, sc.add(STRING_THREE)); }
}
