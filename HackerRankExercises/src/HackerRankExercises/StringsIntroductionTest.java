package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsIntroductionTest {

	@Test
	public void test1Failure() {
		String a = "Joe";
		String b = "Nancy";
		String expectedString = "JoeNancy";
		assertEquals(expectedString,StringsIntroduction.stringIntroduction(a, b));
	}

}
