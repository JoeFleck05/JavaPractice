package stringCalculaterNine;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculaterTest {

	StringCalculater sC = new StringCalculater();
	
	private static String STRING_ZERO = "0";
	private static Object EXPECT_RESULT_ONE = 0;
	
	private static String STRING_NUMBER = "1";
	private static Object EXPECT_RESULT_TWO = 1;
	
	private static String STRING_NUMBERS = "12\n12,12";
	private static Object EXPECT_RESULT_THREE = 36;
	
	private static String STRING_DELIMITER = "//;\n12;12";
	private static Object EXPECT_RESULT_FOUR = 24;
	
	private static String STRING_ANY_TYPE_OF_DELIMITER = "//-\n12-12";
	
	private static String STRING_NEGATIVES = "12,-12";
	
	private static String STRING_WITH_GREATER_THAN_THOUSAND = "//;\n12;12;11;1000";
	private static Object EXPECT_RESULT_FIVE = 35;
	
	@Test
	public void returnZero() {	assertEquals(EXPECT_RESULT_ONE, sC.add(STRING_ZERO)); }
	@Test
	public void returnSumOfNumbers() {	assertEquals(EXPECT_RESULT_THREE, sC.add(STRING_NUMBERS)); }
	@Test
	public void returnSumOfNumbersWithDelimiter() {	assertEquals(EXPECT_RESULT_FOUR, sC.add(STRING_DELIMITER)); }
	@Test
	public void returnSumOfNumbersWithAnyDelimiter() {	assertEquals(EXPECT_RESULT_FOUR, sC.add(STRING_ANY_TYPE_OF_DELIMITER)); }
	@Test
	public void returnNegative() {	assertEquals(EXPECT_RESULT_FOUR, sC.add(STRING_NEGATIVES)); }
	@Test
	public void returnNothingOverThousand() {	assertEquals(EXPECT_RESULT_FIVE, sC.add(STRING_WITH_GREATER_THAN_THOUSAND)); }
	
}
