package interviewQ1TopNumVersion2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TopNinthTest {

	TopNinth tn = new TopNinth();
	
	private Integer[] ARRAY_ONE = {120,23,21,45,78,90,1,67,89};
	private int[] EXPECTED_RESULT = {120,90,89,78};
	private int RETURN_NUMBER = 3;
	
	private Integer[] ARRAY_WITH_NULLS = {120,null,21,null,78,null,1,67,89};
	private int[] EXPECTED_RESULT_WITH_NULLS = {0,0,0,0};
	
	@Test
	public void returnTopNinth() { assertArrayEquals(EXPECTED_RESULT,  tn.TopNinth(ARRAY_ONE,RETURN_NUMBER)); }
	
	@Test
	public void returnTopNinthNull() { assertArrayEquals(EXPECTED_RESULT_WITH_NULLS,  tn.TopNinth(ARRAY_WITH_NULLS,RETURN_NUMBER)); }
	
	@Test
	public void returnNullResponse() { assertTrue(tn.justNull(ARRAY_WITH_NULLS)); }

}
