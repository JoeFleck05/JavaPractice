package HackerRankExercises;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class JavaStringCompareTest {

	JavaStringCompare jsc = new JavaStringCompare();
	@Test
	public void testOne() {
		String myString = "welcometojava";
		int myInt = 3;
		ArrayList<String> expectedString = new ArrayList<>(Arrays.asList("ava","wel"));
		assertEquals(expectedString, jsc.javaStringCompare(myInt, myString));
		
	}

}
