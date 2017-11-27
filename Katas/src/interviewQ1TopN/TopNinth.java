package interviewQ1TopN;

import java.util.Arrays;

public class TopNinth {

	public int[] returnTopNinth(int[] n, int loopNum){
		
		int[] reverseArray = new int[loopNum + 1];
		int stopLoop = n.length - 1 - loopNum;
		Arrays.sort(n);
		int s = 0;
		
		for(int i = n.length - 1 ; i >= stopLoop ; i--) {
			System.out.println(reverseArray[s] = n[i]);
			s += 1;
		}
		
		return reverseArray;
	}
}
