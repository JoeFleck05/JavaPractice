package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseTest {
    
    StringReverse javaStringReverse = new StringReverse();
    
    private final String EXPECT_YES = "Yes";
    private final String EXPECT_NO = "No";

    @Test
    public void testOne() {
        String A = "madam";
        assertEquals(EXPECT_YES, StringReverse.reverseString(A));
    }
    
    @Test
    public void testTwo() {
    	String A = "joemomma";
    	assertEquals(EXPECT_NO, StringReverse.reverseString(A));
    }
    
    @Test
    public void testThree() {
    	String A = "mom";
    	assertEquals(EXPECT_YES, StringReverse.reverseString(A));
    }

}
