package stringCalculaterFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {
	
	StringCalculater stringCalculater = new StringCalculater();
	
	private static String STRING_ONE = "0";
	private static int EXPECTED_INT_ONE = 0;

	private static String STRING_TWO = "22\n12,23";
	private static int EXPECTED_INT_TWO = 57;
	
	private static String STRING_THREE = "//;\n12;23";
	private static int EXPECTED_INT_THREE = 35;
	
	@Test
	public void returnZero() { assertEquals(EXPECTED_INT_ONE, stringCalculater.add(STRING_ONE)); }

	@Test
	public void returnSumOfMultipleStrings() { assertEquals(EXPECTED_INT_TWO, stringCalculater.add(STRING_TWO)); }
	
	@Test
	public void returnSumOfMultipleStringsWithDelimiter() { assertEquals(EXPECTED_INT_THREE, stringCalculater.add(STRING_THREE)); }
}
