package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternSyntaxCheckerTest {
	
	PatternSyntaxChecker patternSyntaxChecker = new PatternSyntaxChecker();

	final int N = 3;
	final String INSERT_STRING_ONE = "([A-Z])(.+)";
	final String INSERT_STRING_TWO = "[AZ[a-z](a-z)";
	final String INSERT_STRING_THREE = "batcatpat(nat";
	
	final String EXPECTED_RESULT_ONE = "Valid";
	final String EXPECTED_RESULT_TWO = "Invalid";
	final String EXPECTED_RESULT_THREE = "Invalid";
			
	@Test
	public void testOne() {
		assertEquals(EXPECTED_RESULT_ONE, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING_ONE));
	}

	@Test
	public void testTwo() {
		assertEquals(EXPECTED_RESULT_TWO, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING_TWO));
	}
	
	@Test
	public void testThree() {
		assertEquals(EXPECTED_RESULT_THREE, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING_THREE));
	}
}
