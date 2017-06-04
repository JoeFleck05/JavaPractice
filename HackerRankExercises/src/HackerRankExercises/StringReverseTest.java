package HackerRankExercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseTest {
    
    StringReverse javaStringReverse = new StringReverse();
    
    private final String EXPECTED_ANSWER = "Yes";

    @Test
    public void test() {
        String A = "madam";
        
        assertEquals(EXPECTED_ANSWER, StringReverse.reverseString(A));
    }

}
