package stringCalculaterSeven;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {
	
	StringCalculater sc = new StringCalculater();
	
	private static String STRING_ONE = "0";
	private static int EXPECTED_ONE = 0;
	
	private static String STRING_TWO = "1\n2,3";
	private static int EXPECTED_TWO = 6;

	private static String STRING_THIRD = "//;\n2;3";
	private static int EXPECTED_THIRD = 5;
	
	@Test
	public void returNumber() {	assertEquals(EXPECTED_ONE, sc.add(STRING_ONE));	}

	@Test
	public void returSumOfMultipleNumbers() { assertEquals(EXPECTED_TWO, sc.add(STRING_TWO)); }
	
	@Test
	public void returSumOfMultipleNumbersDelimiter() { assertEquals(EXPECTED_THIRD, sc.add(STRING_THIRD)); }
}
