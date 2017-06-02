package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsIntroductionTest {

	@Test
	public void test1Pass() {
		String a = "hello";
		String b = "java";
		String expectedString = "9 No Hello Java";
		assertSame(expectedString,StringsIntroduction.stringIntroduction(a, b));
	}

	@Test
	public void test2Pass() {
		String a = "Joe";
		String b = "Momma";
		String expectedString = "8 No Joe Momma";
		assertSame(expectedString,StringsIntroduction.stringIntroduction(a, b));
	}
	
	@Test
	public void test3YesPass() {
		String a = "zebra";
		String b = "amber";
		String expectedString = "10 Yes Zebra Amber";
		assertSame(expectedString,StringsIntroduction.stringIntroduction(a, b));
	}
}
