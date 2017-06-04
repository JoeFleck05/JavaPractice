package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class javaAnagramsTest {
	
	javaAnagrams jA = new javaAnagrams();

	@Test
	public void testOne() {
		String a = "anagram";
		String b = "margana";
		assertTrue(jA.javaAnagrams(a,b));
	}

}
