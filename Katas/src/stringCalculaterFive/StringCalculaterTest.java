package stringCalculaterFive;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {

	StringCalculater sc = new StringCalculater();
	
	private static String STRING_ONE = "0";
	private static int EXPECTED_INT_ONE = 0;
	
	private static String STRING_TWO = "10\n23,23";
	private static int EXPECTED_INT_TWO = 56;
	
	private static String STRING_THREE = "//;\n23;23";
	private static int EXPECTED_INT_THREE = 46;
	
	@Test
	public void returnZero() { assertEquals(EXPECTED_INT_ONE, sc.add(STRING_ONE)); }
	
	@Test
	public void returnSumOfMultiples() { assertEquals(EXPECTED_INT_TWO, sc.add(STRING_TWO)); }

	@Test
	public void returnSumOfMultiplesWithDelimiter() { assertEquals(EXPECTED_INT_THREE, sc.add(STRING_THREE)); }
}

