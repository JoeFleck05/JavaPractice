package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaStringTokenTest {

	JavaStringToken javaStringToken = new JavaStringToken();
	private final String[] EXPECTED_ARRAY = {"He","is","a","very","very","good","boy","isn't","he"};
	@Test
	public void test() {
		String s = "He is a very very good boy, isn't he?";
		assertArrayEquals(EXPECTED_ARRAY, javaStringToken.javaStringToken(s));
	}

}
