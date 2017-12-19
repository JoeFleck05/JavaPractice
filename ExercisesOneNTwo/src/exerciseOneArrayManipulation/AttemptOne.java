package exerciseOneArrayManipulation;

import java.util.Arrays;

public class AttemptOne {

	public int[] descendingArray(int[] n) {
		int[] revisedArray = new int[n.length];
		int b = 0;
		Arrays.sort(n);
		for(int i = n.length - 1 ; i >= 0 ; --i){
			revisedArray[b] = n[i];
			b += 1;
		}		
		return revisedArray;
	}
}
