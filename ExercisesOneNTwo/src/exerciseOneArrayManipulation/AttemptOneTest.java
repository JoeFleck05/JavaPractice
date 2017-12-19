package exerciseOneArrayManipulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AttemptOneTest {
	
	private static int[] ACTUAL_RESULT_ONE = {1,2,3};
	private static int[] EXPECTED_RESULT_ONE = {3,2,1};
	
	AttemptOne ao = new AttemptOne();

	@Test
	public void returnArrayDescending() { assertArrayEquals(EXPECTED_RESULT_ONE, ao.descendingArray(ACTUAL_RESULT_ONE)); }

}
