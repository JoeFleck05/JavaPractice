package stringCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorOneTest {
	
	StringCalculatorOne stringCalculatorOne = new StringCalculatorOne();
	private String[] ACTUAL_STRING_ONE = {"0","1","2"};
	private int EXPECTED_STRING_ONE = 3;
	
	private String[] ACTUAL_STRING_TWO = {"1","12","7"};
	private int EXPECTED_STRING_TWO = 20;
	
	@Test
	public void testRequirementOne() { assertEquals(EXPECTED_STRING_ONE, stringCalculatorOne.sumItUp(ACTUAL_STRING_ONE)); }
	
	@Test
	public void testRequirementOneTwo() { assertEquals(EXPECTED_STRING_TWO, stringCalculatorOne.sumItUp(ACTUAL_STRING_TWO)); }
}
