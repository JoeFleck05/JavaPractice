package exerciseOneArrayManipulationTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseOneTest {

	ExerciseOne eO = new ExerciseOne();
	
	private static int[] EXPECTED_INT_ARRAY_ONE = {23,12,24,43,1,67};
	private static int TOP_N = 3;
	private static int[] ACTUAL_ORDER_INT_ARRAY_ONE = {67,43,24};
	@Test
	public void intArrayDescTopNTestOne() { assertArrayEquals(ACTUAL_ORDER_INT_ARRAY_ONE, eO.intArrayDesc(EXPECTED_INT_ARRAY_ONE, TOP_N));	}

	private static int[] EXPECTED_INT_ARRAY_TWO = {23,12,24,43,1001,109};
	private static int TOP_N_TWO = 3;
	private static int[] ACTUAL_ORDER_INT_ARRAY_TWO = {1001,109,43};
	@Test
	public void intArrayDescTopNTestTwo() { assertArrayEquals(ACTUAL_ORDER_INT_ARRAY_TWO, eO.intArrayDesc(EXPECTED_INT_ARRAY_TWO, TOP_N_TWO)); }
}
