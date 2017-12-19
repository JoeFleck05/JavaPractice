package stringCalculatorThree;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator stringCalc = new StringCalculator();
	
	private static String STRING_ONE = "0";
	private static int EXPECTED_RESULT_ONE = 0;
	
	private static String STRING_TWO = "1,2,3";
	private static int EXPECTED_RESULT_TWO = 6;
	
	private static String STRING_THREE = "1\n2,3";
	private static int EXPECTED_RESULT_THREE = 6;
	
	private static String STRING_FOUR = "//;\n2,3";
	private static int EXPECTED_RESULT_FOUR = 5;
	
	@Test
	public void returnZero() { assertEquals(EXPECTED_RESULT_ONE, stringCalc.add(STRING_ONE)); }

	@Test
	public void returnSum() { assertEquals(EXPECTED_RESULT_TWO, stringCalc.add(STRING_TWO)); }
	
	@Test
	public void returnSumWithNewLine() { assertEquals(EXPECTED_RESULT_THREE, stringCalc.add(STRING_THREE)); }
	
	@Test
	public void returnSumWithDelimiter() { assertEquals(EXPECTED_RESULT_FOUR, stringCalc.add(STRING_FOUR));	}
}