package interviewQ1TopN;

import static org.junit.Assert.*;
import org.junit.Test;

public class TopNinthTest {

	TopNinth tn = new TopNinth();
	
	private int[] A = { 99, 21, 56, 104, 56, 12, 1, 88, 100, 91, 74, 1007 };
	
	private int NUM_LOOPS = 3;
	private int[] TOP_THREE = {1007,104,100,99};
	
	@Test
	public void returnIntArray() { assertArrayEquals(TOP_THREE,tn.returnTopNinth(A,NUM_LOOPS)); }

}
