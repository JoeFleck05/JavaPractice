package stringCalculaterEight;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {
	
	StringCalculater sC = new StringCalculater();
	
	private String STRING_ZERO = "0";
	private Object EXPECTED_RESULT = 0;

	private String STRING_MULTIPLE_NUM = "1\n22,23";
	private Object EXPECTED_RESULTS = 46;
	
	private String STRING_MULTIPLE_AND_GREAT_THAN_1000 = "1\n22,23,1000,34,999";
	private Object EXPECTED_RESULTS_TWO = 1079;
	
	private String STRING_MULTIPLE_DELIMITER = "//-\n23-23";
	
	private String STRING_MULTIPLE_INCLUDE_NEGATIVES = "//;\n-23;-23";
	
	@Test
	public void test() { assertEquals(EXPECTED_RESULT, sC.add(STRING_ZERO)); }
	
	@Test
	public void stringMultipleNumbers() { assertEquals(EXPECTED_RESULTS, sC.add(STRING_MULTIPLE_NUM)); }
	
	@Test
	public void stringMultipleNumbersOverThousand() { assertEquals(EXPECTED_RESULTS_TWO, sC.add(STRING_MULTIPLE_AND_GREAT_THAN_1000)); }
	
	@Test
	public void stringMultipleNumbersWithDelimiter() { assertEquals(EXPECTED_RESULTS, sC.add(STRING_MULTIPLE_DELIMITER)); }
	@Test
	public void stringMultipleNumbersWithNegative() { assertEquals(EXPECTED_RESULTS, sC.add(STRING_MULTIPLE_INCLUDE_NEGATIVES)); }

}
