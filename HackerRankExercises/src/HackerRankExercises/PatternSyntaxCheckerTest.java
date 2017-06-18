package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatternSyntaxCheckerTest {
	
	PatternSyntaxChecker patternSyntaxChecker = new PatternSyntaxChecker();

	final int N = 3;
	final String[] INSERT_STRING = {"([A-Z])(.+)","[AZ[a-z](a-z)","batcatpat(nat"};
	final String INSERT_STRING_TWO = "[AZ[a-z](a-z)";
	final String INSERT_STRING_THREE = "batcatpat(nat";
	
	final String[] EXPECTED_RESULT = {"Valid","Invalid","Invalid"};
	final String EXPECTED_RESULT_TWO = "Invalid";
	final String EXPECTED_RESULT_THREE = "Invalid";
			
//	@Test
//	public void testOne() {
//		assertArrayEquals(EXPECTED_RESULT, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING));
//	}
//
//	@Test
//	public void testTwo() {
//		assertEquals(EXPECTED_RESULT_TWO, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING_TWO));
//	}
//	
//	@Test
//	public void testThree() {
//		assertEquals(EXPECTED_RESULT_THREE, patternSyntaxChecker.patternSyntaxChecker(N, INSERT_STRING_THREE));
//	}
}
