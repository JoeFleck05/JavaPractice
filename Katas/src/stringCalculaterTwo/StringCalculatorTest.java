package stringCalculaterTwo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {
	StringCalculater strCalc = new StringCalculater();
	
	private static String STRING_ONE = "0";
	private static int EXPECTED_ZERO = 0;
	
	private static String STRING_TWO = "1,23,21";
	private static int EXPECTED_NUMBER = 45;
	
	private static String STRING_THREE = "1\n23,21";
	private static int EXPECTED_NUMBER_TWO = 45;
	
	private static String STRING_FOUR = "//;\n1;2";
	private static int EXPECTED_NUMBER_THREE = 3;
	
	@Test
	public void stringCalculatorZero() { assertEquals(EXPECTED_ZERO,strCalc.add(STRING_ONE)); }
	
	@Test
	public void stringCalculatorReturnNumber() { assertEquals(EXPECTED_NUMBER,strCalc.add(STRING_TWO)); }

	@Test
	public void stringCalculatorMultipleNumbers() { assertEquals(EXPECTED_NUMBER_TWO,strCalc.add(STRING_THREE)); }
	
	@Test
	public void stringCalculatorWithDelimiter() { assertEquals(EXPECTED_NUMBER_THREE,strCalc.add(STRING_FOUR)); }
}
